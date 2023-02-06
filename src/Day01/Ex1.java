// 모든언어 가장 중요한 문법 1순위 = 주석/메모

// 주석 :  : 실행시 실행이 안되는 구역
// 학습용 , 기록용 , 협업용 등등

// 한줄 주석
/*
    여러줄 주석
*/

package Day01; // 현재 클래스(소스)파일이 위치한 패키지명 표시

// !: 자바는 무조건 클래스 안 {  }에서 코드 작성
// int a ; // 빨간줄 나오면서 오류 라서 주석
public class Ex1 { // 클래스 시작
    int b ; // 빨간줄 없으면서 오류없다. // 화면 출력 X
    // 실행해야지 --> 실행화살표 없다
    // m + 엔터
    // 실행할 코드는 무조건 main함수 { } 안에서 작성
    // main함수 : main스레드(코드 실제로 실행하는 주체)
    public static void main(String[] args) { // main 시작
        // 콘솔창에 출력
        // sout + 엔터
        // System.out.println("출력하고 싶은말");
        System.out.println("안녕하세요 자바!!");
        System.out.println("두번째 출력입니다.");

        // 제어문자[이스케이프문자]    \ : 엔터위에 원화기호
        System.out.println("문자열 출력");               // "문자열" 구분
        System.out.println("안녕하세요\t들여쓰기");      // \t : 들여쓰기
        System.out.println("안녕하세요\n줄바꿈");       // \n : 줄바꿈
        //System.out.println(" "안녕하세요" ");       // " 출력x
        System.out.println(" \"안녕하세요\" ");      // \" 출력o
        //System.out.println(" \ ");                // \ 출력x
        System.out.println(" \\ ");                 // \ 출력o

        // 예제1 : 토끼 출력하자
        /*
            \    /\
             )  ( ')
            (  /  )
             \(__)|
         */
        System.out.println("\\    /\\");
        System.out.println(" )  ( \')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|"); // | : 엔터위에 원화기호 + shift

        /* 과제1 */
        /*
            |\_/|
            |q p|   /}
            ( 0 )"""\
            |"^"`    |
            ||_/=\\__|
         */
        System.out.println("\n");
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

        /* 과제2 */
        /*

                     ,r'"7
            r`-_   ,'  ,/
             \. ". L_r'
               `~\/
                  |
                  |

         */
        System.out.println("\n");
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");

        /* 과제3 */
        /*
                       __   __
                      __ \ / __
                     /  \ | /  \
                         \|/
                    _,.---v---._
           /\__/\  /            \
           \_  _/ /              \
             \ \_|           @ __|
              \                \_
               \     ,__/       /
             ~~~`~~~~~~~~~~~~~~/~~~~
         */
        System.out.println("\n");
        System.out.println("               __   __");
        System.out.println("              __ \\ / __");
        System.out.println("             /  \\ | /  \\");
        System.out.println("                 \\|/");
        System.out.println("            _,.---v---._");
        System.out.println("   /\\__/\\  /            \\");
        System.out.println("   \\_  _/ /              \\");
        System.out.println("     \\ \\_|           @ __|");
        System.out.println("      \\                \\_");
        System.out.println("       \\     ,__/       /");
        System.out.println("     ~~~`~~~~~~~~~~~~~~/~~~~");

        /* 과제4 */
        /*
                      __     __
                     /  \~~~/  \
               ,----(     ..    )
              /      \__     __/
             /|         (\  |(
            ^ \   /___\  /\ |
               |__|   |__|-"

         */
        System.out.println("\n");
        System.out.println("              __     __");
        System.out.println("             /  \\~~~/  \\");
        System.out.println("       ,----(     ..    )");
        System.out.println("      /      \\__     __/");
        System.out.println("     /|         (\\  |(");
        System.out.println("    ^ \\   /___\\  /\\ |");
        System.out.println("       |__|   |__|-\"");

    } // main 끝
} // 클래스 끝

