# helloDI

Spring의 핵심 기능인 DI(Dependency Injection) 실습 프로젝트


🔍 **Dependency Injection**

- **framework**에 의해 객체들의 의존성이 주입되는 **디자인 패턴**
- 장점: **Reduced Dependencies**
- 방법: Constructor-based / Setter-based

🔍 **Spring Container**
- Spring framework의 핵심 컴포넌트
- 객체 생성 및 관리 (**Inversion of Control**)
- 객체의 의존성 주입 (**Dependency Injection**)
- Configuration: **XML**, **Java annotations**, Java-based Configuration

📄 **Summary**
- 'bean'들은 Spring Container에 의해서 생성 및 관리된다
  (bean: POJO 스타일의 객체)
- Spring Container는 애플리케이션을 구성하는 컴포넌트들에 대해 Depndency Injection을 적용한다
- DI는 loosely coupled application을 만드는 데 도움을 준다

✏️ **Example Description**
- AnimalType: 인터페이스
- Dog, Cat: AnimalType을 구현한 클래스
- PetOwner: AnimalType의 owner 👉 **AnimalType에 Dog나 Cat이 주입됨**
- DI 및 Configuration 방법
  - Dog, Cat: **Setter-based, XML**
  - PetOwner: **Constructor-based, Annotation**

✔️ **Run**
- PetOwner bean의 AnimalType에 Dog 주입 (🐶🔉)
  
  <img src="https://user-images.githubusercontent.com/56067179/110227270-f4b07300-7f39-11eb-8187-0c37c2d832a6.PNG" width="600"/>

- PetOwner bean의 AnimalType에 Cat 주입 (🐱🔉)

  <img src="https://user-images.githubusercontent.com/56067179/110227269-f37f4600-7f39-11eb-8a77-3a97bd5b785c.PNG" width="600"/>
  


