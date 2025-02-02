# 놀라운 사실
- 자바 배열에는 인덱스로 삭제하는 함수가 없다 (파이썬에는 있음)
- 인덱스 삭제하고싶으면 리스트로 바꾼 다음 remove함수 사용하면 된다

# 함수(method) 사용법
```java
public static Main{
    static int a; //전역변수 선언
    static int b;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        a = nextInt();
        b = nextInt();
        System.out.println(add(a,b));
    }

    public static int add(int a,int b){ //return 값이 int로 있을때 int add로...없으면 void
        return a+b;
    }

}
```
# 문자열 기본 함수
```java
String st = "hello";
st.length(); //문자열 길이

StringBuffer st2 = new StringBuffer(st);
st2.reverse().toString(); //문자열 거꾸로 만들기

// 문자열 배열에 집어넣기
String str = br.readLine();
String[] arr = str.split("");

// 문자열 중복제거
for(int i =0; i<str.length(); i++) {
	if(str.indexOf(str.charAt(i))==i) answer +=str.charAt(i);
}

// sort함수 응용
Arrays.sort(arr, new Comparator<String>(){
    @Override
    public int compare(String o1, String o2) {
        if(o1.length()==o2.length()){ //길이같으면
            return o1.compareTo(o2); //알파벳순정렬
        }
        else{
            return o1.length() - o2.length(); //길이 짧은순 정렬
        }
    }
});
```

# 배열 입력 BufferdReader
```java
//빠른 입력(알고리즘 풀이때 많이들 씀)

import java.io.*;
import java.util.*; // StringTokenizer

public class baekjoon_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 정수 하나 입력

        String s = br.readLine(); // 문자열 입력

	// 입력받은 정수 배열에 하나씩 넣기
	String n = br.readLine();
        int[] arr = new int[n.length()];

        for(int i=0;i<n.length();i++){
            arr[i] = n.charAt(i) - '0';
        }

        // 정수 공백 기준으로 n,m 변수에 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 문자열 형태로 받아서 잘라서 넣어도 됨
        String s = br.readLine();
        String [] arr = s.split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);

        // 정수 공백 기준으로 배열에 입력
        int[] nums = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        // 문자열 엔터 기준 배열에 입력
        String[] words = new String[5];
        for(int i = 0; i < 5; i++)
            words[i] = br.readLine();
```

# AllayList
```java
ArrayList<String> l = new ArrayList<>();
l.size() // l.length 가 아님!
```

# 배열 입력 Scanner
```java
//공백없는 int 일차원 배열 입력받고 출력하기

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];

String[] s = sc.next().split("");
for(int i=0;i<n;i++){
    arr[i] = Integer.parseInt(s[i]);
}

System.out.println(Arrays.toString(arr));

//공백없는 int 이차원 배열 입력받고 출력하기

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int[][] arr = new int[n][m];

for(int i=0;i<n;i++){
    String[] s = sc.next().split("");
    for(int j = 0; j<m;j++){
        arr[i][j] = Integer.parseInt(s[j]);
    }
}

System.out.println(Arrays.deepToString(arr));

//공백있는 char 이차원 배열 입력받기

int n = sc.nextInt();

char[][] arr = new char[n][n];

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        arr[i][j] = sc.next().charAt(0);
    }
}

```

# String 비교
```java
str.equals("*")
// char 비교시엔 ==써도 되지만 string비교시엔 무조건 equals사용해야한다!
```

# bfs 구현할때 큐
```java
Queue<int[]> q = new LinkedList<>(); //선언
q.add(new int[]{x,y}); //큐에 x,y 넣을때
```

# 연산자
```java
int i = 10/3;
System.out.println(i); //3

float f = 10/3;
System.out.println(f); //3.0

float f2 = 10f/3F;
System.out.println(f2); //3.3333333

double d = 10d/3D;
System.out.println(d); //3.33333333335
```

# Math 메소드

```java
// 1. random() 메소드 - 자바 랜덤 함수
System.out.println((int)(Math.random() * 100)); // 0 ~ 99 Random 
ran = new Random(); 
System.out.println(ran.nextInt(100)); // 0 ~ 99

// 2. abs() 메소드 - 자바 절대값 함수
System.out.println(Math.abs(-10)); // 10

// 3. floor() 메소드, ceil() 메소드와 round() 메소드 - 자바 내림, 올림, 반올림 함수
System.out.println(Math.ceil(10.1)); // 11.0
System.out.println(Math.floor(10.0)); // 10.0
System.out.println(Math.floor(10.9)); // 10.0 
System.out.println(Math.round(10.0)); // 10 
System.out.println(Math.round(10.4)); // 10 
System.out.println(Math.round(10.5)); // 11

// 4. max() 메소드와 min() 메소드 - 자바 최대값, 최소값 함수
System.out.println(Math.max(-10, -11)); // -10 
System.out.println(Math.min(-10, -11)); // -11​

// 5. pow() 메소드와 sqrt() 메소드 - 자바 제곱, 제곱근 함수
System.out.println((int)Math.pow(5, 2)); // 25
System.out.println((int)Math.sqrt(25)); // 5
```

# 무한루프
```java
while(true){

}
// 위랑 아래랑 같다
for(;true;){

}

//번외 - 큐가 비어있지 않을 때까지 반복문
while(!q.isEmpty()){

}

```
