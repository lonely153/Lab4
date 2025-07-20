import java.util.ArrayList;
/** ADT ที่เก็บเลขจำนวนเต็มใด ๆ เรียงจากน้อยไปมาก ห้ามมี null หรือตัวเลขซ้ำ
 * 
 */

public class IntegerSet {
    ArrayList<Integer> Numbers;

    /**
     * สร้างเซตของเลขด้วย ArrayList
     */
    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void CheckRep(){
        int n = Numbers.size();
        for (int i = 0; i < n-1; i++) {
            if (Numbers.get(i) >= Numbers.get(i+1)) {
                throw new RuntimeException("Rep invariant violated!");
            }
        }
    }
    /**
     * เพิ่มเลขลงในเซต
     * @param x เลขที่ต้องการเพิ่ม
     */
    public void add(Integer x){
        Numbers.add(x);
        try {
            CheckRep();
        } catch (RuntimeException e) {
            System.out.println("Failed to add: " + e.getMessage());
            Numbers.remove(x);
        }
    }
    /**
     * ลบเลขออกในเซต
     * @param x เลขที่ต้องการลบ
     */
    public void remove(Integer x){
        Numbers.remove(x);
        try {
            CheckRep();
        } catch (RuntimeException e) {
            System.out.println("Failed to remove " + e.getMessage());
            Numbers.add(x);
        }
    }

    /**
     * ตรวจสอบว่ามีเลขนี้อยู่ในเซตหรือไม่
     * @param x เลขที่ต้องการตรวจสอบ
     * @return true หากมี x อยู่ในเซต, false หากไม่มี
     */
    public boolean contains(Integer x) {
        return Numbers.contains(x);
    }

    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต Numbers
     */
    public int size() {
        return Numbers.size();
    }

    /**
     * คืนค่าเซตเป็น String
     * @return String ของ Numbers
     */
    public String toString(){
        return Numbers.toString();
    }
}
