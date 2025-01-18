# 배열 입력 받고 출력하기
```java
//공백없는 일차원 배열 입력받고 출력하기

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int[] arr = new int[n];
String[] s = sc.next().split("");
for(int i=0;i<n;i++){
    arr[i] = Integer.parseInt(s[i]);
}

System.out.println(Arrays.toString(arr));

//공백없는 이차원 배열 입력받고 출력하기

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

for(;true;){

}
```
