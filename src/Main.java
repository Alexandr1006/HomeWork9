public class Main {
    public static void main(String[] args) {

//1.1Task(от 1 до 3 и +1 к нечетным)

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int a = 0; a <= 2; a++) {
            if (a != 2) {
                System.out.print(number[a] + ", ");
            } else
                System.out.print(number[a]);
        }
        System.out.println("\n");
        for(int i = 2; i>=0 ; i--){
            if (i != 0) {
                System.out.print(number[i] + ", ");}
            else
            System.out.println(number[i]);
        }
        System.out.println("\n");
        for(int b = 0; b<3; b++){
            if(number[b]%2 !=0)
            {number[b]+=1;}
            if (b != 2) {
                System.out.print(number[b] + ", ");}
            else
                System.out.println(number[b]);
        }



//1.2Task(дробные)
        System.out.println("\n");
        float[] number1 = new float[] {1.57f, 7.654f, 9.986f};
        System.out.println(number1[0] + ", " + number1[1] + ", " + number1[2]);
        System.out.println("\n" + number1[2] + ", " + number1[1] + ", " + number1[0]);

//1.3Task(Произвольный массив)

        int[][]number2 = new int [][]{
                {1, 2},
                {4, 5},
        };

        System.out.println(number2[0][0] + ", " + number2[0][1] + ", " + number2[1][0] + ", " + number2[1][1]);
        System.out.println("\n" + number2[1][1] + ", " + number2[1][0] + ", " + number2[0][1] + ", " + number2[0][0]);





    }
}