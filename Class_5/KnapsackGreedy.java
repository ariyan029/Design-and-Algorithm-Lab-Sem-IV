import java.util.*;
class Item {
    int index;
    int weight;
    int value;
    double ratio;
    Item(int index, int weight, int value) {
        this.index = index;
        this.weight = weight;
        this.value = value;
        this.ratio = (weight > 0) ? (double) value / weight : 0;
    }
}
public class KnapsackGreedy {
    public static class Result {
        int totalValue;
        List<Integer> selectedItems;
        Result(int totalValue, List<Integer> selectedItems) {
            this.totalValue = totalValue;
            this.selectedItems = selectedItems;
        }
    }
    public static Result knapsackGreedy(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        List<Item> items = new ArrayList<>();
        // Create item list
        for (int i = 0; i < n; i++) {
            if (weights[i] > 0) { // Avoid division by zero
                items.add(new Item(i, weights[i], values[i]));
            }
        }
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));
        int totalValue = 0;
        int totalWeight = 0;
        List<Integer> selectedItems = new ArrayList<>();
        // Greedy selection
        for (Item item : items) {
            if (totalWeight + item.weight <= capacity) {
                selectedItems.add(item.index);
                totalWeight += item.weight;
                totalValue += item.value;
            }
        }
        return new Result(totalValue, selectedItems);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("0/1 Knapsack - Greedy Approach");
        System.out.println("==================================================");
        // Input number of items
        System.out.print("\nEnter number of items: ");
        int n = scanner.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        // Input weights and values
        System.out.println("\nEnter weight and value for each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " - Weight: ");
            weights[i] = scanner.nextInt();
            System.out.print("Item " + (i + 1) + " - Value: ");
            values[i] = scanner.nextInt();
        }
        
        System.out.print("\nEnter knapsack capacity: ");
        int capacity = scanner.nextInt();
        
        Result result = knapsackGreedy(weights, values, capacity);
        
        System.out.println("\n==================================================");
        System.out.println("RESULTS");
        System.out.println("==================================================");
        System.out.println("\nMaximum value obtained: " + result.totalValue);
        Collections.sort(result.selectedItems);
        System.out.println("\nSelected items (0-indexed): " + result.selectedItems);
        System.out.println("\nDetails of selected items:");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Item", "Weight", "Value", "Ratio");
        System.out.println("----------------------------------------");
        int totalWeight = 0;
        for (int idx : result.selectedItems) {
            double ratio = (double) values[idx] / weights[idx];
            System.out.printf("%-10d %-10d %-10d %-10.2f\n",
                    idx, weights[idx], values[idx], ratio);
            totalWeight += weights[idx];
        }
        System.out.println("----------------------------------------");
        System.out.println("Total weight used: " + totalWeight + "/" + capacity);
        System.out.println("\n==================================================");
        System.out.println("Note: Greedy approach may not always give");
        System.out.println("the optimal solution for 0/1 Knapsack problem");
        System.out.println("==================================================");

        scanner.close();
    }
}
