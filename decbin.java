/**
 * This program converts decimal to binary
 */



class DectoBin{
    static void convert(int b) {
        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter the decimal number: ");
        // int dec = a.nextInt();
        int[] decn = new int[1000];  //creating array for binary number
        int i = 0;

        while(b > 0){
            decn[i] = b % 2; // Adding the terms into the the array to store
            b = b / 2;
            i++;
            
       }
       for(int j= i-1; j >= 0;j--){
        System.out.print(decn[j]);
       }
    }
    public static void main(String[] args) {
        
        int b = 17;
        System.out.println("The binary form to the number is");
        convert(b);
    }
    
}