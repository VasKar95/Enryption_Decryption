public class EncryptionDecryption {
    /**This is a program which takes as string element, it encrypts it with a key value and ascii number.After the encryption, decrypts the message
     * via @decryption method.
     *
     * @author Karamanis Vasileios
     * */
    public static void main(String[] args) {
        final int key = 1;
        String text = "M#";

        int[] x = encryption(text, key);
        System.out.printf("The encrypted word to ascii numbers is:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }

        char[] y = decryption(x,text);

        System.out.printf("The dencrypted word is:");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);

        }

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
    /**Here we create a dencryption method which takes as values the @encrypted_array and the text for encryption and returns the text decrypted*/
    public static char[] decryption(int[] encrypted_array, String text) {
        int countd = 0;
        int tcount = 0;
        char cipher;
        int dencrypted_array[];
        dencrypted_array = new int[encrypted_array.length - 1];
        char[] y = new char[encrypted_array.length - 1];

        for (int i = 0; i < encrypted_array.length; i++) {
            if (encrypted_array[i] == -1) {
                break;
            }
            countd = encrypted_array[i] - text.charAt(i);
            tcount = encrypted_array[i] - countd;
            dencrypted_array[i] = tcount;
        }
        for (int i = 0; i < dencrypted_array.length; i++) {
            cipher = (char) (dencrypted_array[i]);
            y[i] = cipher;

        }
        return y;
    }
}
