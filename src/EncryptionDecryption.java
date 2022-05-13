public class EncryptionDecryption {
    public static void main(String[] args) {

    }
/**Here we create a encryption method which takes as values @text and @key and returns the encrypted text to ascii numbers*/
    public static int[] encryption(String text, int key) {
        int array_length = text.length();
        int encrypted_array[];
        encrypted_array = new int[array_length];
        int count = 0;

        for (int i = 0; i <= text.length(); i++) {
            //The ASCII number of # is 35,where # is the end of the message
            if ((text.charAt(i) == 35)) {
                //-1 is the last element of the array
                encrypted_array[i] = -1;
                break;
            }
            //is the total sum of ascii num
            count = text.charAt(i) + count;

            //encrypted numbers of text are on encrypted_array
            encrypted_array[i] = count / key;
        }
        return encrypted_array;
    }
}
