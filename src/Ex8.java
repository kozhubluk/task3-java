import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String arr[] = new String[n];
        String temp;
        // первый способ
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        // второй способ (переворачиваем обратно)
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
