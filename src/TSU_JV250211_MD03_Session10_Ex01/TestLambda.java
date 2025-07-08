package TSU_JV250211_MD03_Session10_Ex01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestLambda {
    public static void main(String[] args) {
        //tao danh sach so nguyen
        List <Integer> lists = Arrays.asList(1,2,4,8,0,7,3,6,2,12);

        //su dung lambda de tim so so chan va in ra
        Predicate<Integer> p = num -> num % 2 == 0;
        System.out.println("___cac so chan chia het cho 2 la:");
        lists.stream().filter(p).forEach(System.out::println);

       //tinh tong cac so
        int sum = lists.stream().mapToInt(num -> num).sum();
        System.out.println("tong cac so la: "+ sum);
        //tim gtri lon nhat cua list
        int max = lists.stream().mapToInt(num -> num).max().getAsInt();
        System.out.println("blabal : " + max);
        int min = lists.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("so nho nhat : " + min);

    }
}
