import java.util.Scanner;

public class discount {
    /**
     * ham kiem tra gia tri dau vao
     */
    public static void sale(String gender, double height) {
        if(!gender.equals("Male") && !gender.equals("Female")) {
            return;
        }
        if(height < 0) {
            return;
        }
        if(height < 1.5) {
            System.out.println("Bạn được giảm giá 50%!");
        }
        if(height >= 1.5 && height < 1.6) {
            System.out.println("Bạn được giảm giá 25%!");
        }
        if(height >= 1.6 && height < 1.7) {
            if (gender.equals("Male")) {
                System.out.println("Bạn được giảm giá 25%!");
            } else {
                System.out.println("Bạn được giảm giá 10%!");
            }
        }
        if(height >= 1.7 && height < 1.8) {
            if (gender.equals("Male")) {
                System.out.println("Bạn được giảm giá 10%!");
            } else {
                System.out.println("Rất tiếc, bạn không được giảm giá!");
            }
        }
        if(height >= 1.8) {
            System.out.println("Rất tiếc, bạn không được giảm giá!");
        }
    }

    /**
     * ham main.
     */
    public static void main(String[] arg) {
        String gender;
        double height;
        System.out.print("Nhập giới tính: ");
        Scanner sc = new Scanner(System.in);
        gender = sc.nextLine();
        System.out.print("Nhập chiều cao: ");
        Scanner sc2 = new Scanner(System.in);
        height = sc2.nextDouble();
        sale(gender, height);
    }
}