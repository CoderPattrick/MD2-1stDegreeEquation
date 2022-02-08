import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Một Phương trình bậc 1 có dạng ax+b=0.");
        System.out.println("Nhập giá trị a:");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        System.out.println("Nhập giá trị b:");
        float b = input.nextFloat();
        String text;
if(a==0){
    if(b==0){
        text="Phương trình vô số nghiệm.";
    }
    else {
        text="Phương trình vô nghiệm.";
    }
    System.out.println(text);
}
else {
    float result = -b/a;
    text = "Phương trình có 1 nghiệm là ";
    System.out.printf("%s%f",text,result);
}
    }
}
