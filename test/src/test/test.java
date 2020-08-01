package test;

public class test {
	// static 변수로 실행했을 때와 일반 변수로 실행했을 때의 차이점 깨닫기!
    //int count;
    static int count;

    public test() {
        this.count ++;
        System.out.println("좋아요 갯수 : " + this.count);
    }

    public static void main(String[] args) {
        test hc1 = new test();
        test hc2 = new test();
        
        String from = "나는 행복합니다.";

        int to = Integer.parseInt(from);


        System.out.println(to);
       
    }
}
