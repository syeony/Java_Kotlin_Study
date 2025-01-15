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
