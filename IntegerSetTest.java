public class IntegerSetTest {
    public static void main(String[] args){
        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        // Test 1: การสร้าง, เพิ่มข้อมูล
        System.out.println("\n--- Testing add() and Creating ---");
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        String expected1 = "[1, 2, 3]";
        if (set1.toString().equals(expected1)) {
            System.out.println("PASSED: Add and Creating works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected1 + " but got " + set1.toString());
            failed++;
        }

        //Test 2: ลบ
        System.out.println("\n--- Testing Removing ---");
        set1.remove(1);
        String expected2 = "[2, 3]";
        if (set1.toString().equals(expected2)) {
            System.out.println("PASSED: Removing works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected2 + " but got " + set1.toString());
            failed++;
        }

        //Test 3: ตัวซ้ำ(Exception)
        System.out.println("\n--- Testing Dup ---");
        set1.add(3);
        String expected3 = "[2, 3]";
        if (set1.toString().equals(expected3)) {
            System.out.println("PASSED: Dup works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected3 + " but got " + set1.toString());
            failed++;
        }
        
        //Test 4: ตรวจสอบ
        System.out.println("\n--- Checking ---");
        String expected4 = "[2, 3]";
        if (set1.toString().equals(expected4)) {
            System.out.println("PASSED.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected4 + " but got " + set1.toString());
            failed++;
        }
        

        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }

        
    }
}
