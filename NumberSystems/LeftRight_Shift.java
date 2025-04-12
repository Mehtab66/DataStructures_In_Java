// Description: Left and Right shift of a number.
// when we do left shift of number the bits are moved to left side and one bit (0) added to right side.
// when we do right shift of number the bits are moved to right side and one bit (0) added to left side.

package NumberSystems;

public class LeftRight_Shift {
    public static void main(String[] args) {
        System.out.println("Left Shift of 10: " + (10 << 1)); // 10 * 2^1 = 20
        System.out.println("Right Shift of 10: " + (10 >> 1)); // 10 / 2^1 = 5
    }
}
