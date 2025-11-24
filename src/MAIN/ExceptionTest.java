package MAIN;

public class ExceptionTest {


    public static void main(String[] args) throws Exception {
        int[] numbers = { 1, 2, 3, 0};
        String name = "seoyk";
        int a = 10;
        String num = Integer.toString(a);
        String num2 = "123ㅁ";
        try {
            a = Integer.parseInt(num2);  // number format 예외 x
            System.out.println(a);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(10 / numbers[i]);
            }


            throw new Exception("어떤 예외");



        }catch (ArithmeticException e) {
            System.out.println( "입력 값중에 0이 있어서 0으로 나누는 문제가 발생");
            System.out.println(e.getMessage());
            System.out.println( "가능하면 나누는 수를 0으로 하지 마세요!!");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" 인덱스가 범위를 넘어서도록 참조하는 코드 문제");
        }catch(NumberFormatException e){
            System.out.println("제발 숫자로만 넣어주세요. ");
        }catch (Exception e) {
            System.out.println(" 기타 예외 : " + e.getMessage());
        } finally {
            // 예외 발생 여부와 상관없이 무조건 실행
            System.out.println("리소스 정리");
        }

    }
}
