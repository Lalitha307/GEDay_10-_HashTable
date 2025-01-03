public class Main {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        HashTable hashTable = new HashTable(10);

        String[] words = paragraph.split(" ");
        for (String word : words) {
            hashTable.put(word, 1);
        }

        System.out.println("Before removal of 'avoidable':");
        hashTable.printHashTable();

        hashTable.remove("avoidable");

        System.out.println("\nAfter removal of 'avoidable':");
        hashTable.printHashTable();
    }
}