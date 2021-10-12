import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("몇 개의 수를 입력할 예정인가요?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; // 입력 받을 수 만큼의 배열 선언

        System.out.println("수를 입력하세요:");
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }   // 입력 받은 숫자를 index 0부터 차례대로 저장

        int max=arr[n-1];
        int min=arr[n-1]; //일단 최대, 최솟값을 모두 배열의 마지막 숫자로 지정
        for(int i=0; i<n; i++) {
            if(arr[i] > max) {
                max=arr[i]; //배열의 첫번째 부터 끝까지 max 보다 큰 값이 있으면 그 값을 max로 바꿔줌
            }
        }
        for(int i=0; i<n; i++) {
            if(arr[i] < min) {
                min=arr[i]; // 마찬가지로 min 보다 작은 값이 있으면 그 값을 min으로 바꿔줌
            }
        }
        System.out.println("최댓값 : " +max);
        System.out.println("최솟값 : " +min);
    }
}