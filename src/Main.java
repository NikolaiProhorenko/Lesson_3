import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        shessBoard();

    }

    static void shessBoard() {
        char[][] shess = new char[8][8];
        char[] symbol = {'W','B'};
        for (int xx = 0, num = 0 ; xx < shess.length;xx++)
        {
            for (int z = 0; z < shess[xx].length;z++)
            {
                shess[xx][z] = symbol[num];
                num = (num == 0) ? ++num : --num;
            }
        }
        System.out.println(Arrays.deepToString(shess));
    }

}