import java.util.Scanner;

public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int highestQuantity = sectionA[0];
        String highestSection = "Section A";
        int highestItem = 1;

        // Calculate totals for Section A
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestItem = i + 1;
            }
        }

        // Calculate totals for Section B
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestItem = i + 1;
            }
        }

        // Compare totals
        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + highestQuantity
                + " (" + highestSection + ", Item " + highestItem + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sectionA = new int[3];
        int[] sectionB = new int[3];

        System.out.println("Enter quantities for Section A:");

        for (int i = 0; i < sectionA.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            sectionA[i] = sc.nextInt();
        }

        System.out.println("Enter quantities for Section B:");

        for (int i = 0; i < sectionB.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}