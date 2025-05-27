# React.js, 스프링 부트, AWS로 배우는 웹 개발 101 (2판) 실습 프로젝트

이 저장소는 『React.js, 스프링 부트, AWS로 배우는 웹 개발 101 (2/e)』 책을 기반으로 한 실습 프로젝트를 위한 저장소입니다.  
책에서 소개하는 SPA(Single Page Application) + REST API 아키텍처를 따라 Spring Boot를 이용한 백엔드 웹 애플리케이션을 구성합니다.

## 참고한 도서

- **제목:** React.js, 스프링 부트, AWS로 배우는 웹 개발 101 (2판)  
- **부제:** SPA, REST API 기반 웹 애플리케이션 개발  
- **저자:** 김다정  
- **출판사:** 위키북스

## 사용 기술 스택

### 백엔드
- Java 17
- Spring Boot
- Spring Web / JPA / Validation
- H2 / MySQL
- Gradle
- REST API 설계

### 프론트엔드 (해당 실습 이후 연동 예정)
- React.js (with CRA or Vite)
- Axios
- React Router

### 인프라 (진행 시)
- AWS EC2
- Nginx
- Docker, Docker Compose

## 실습 진행

본 프로젝트는 각 장의 실습 내용에 따라 점진적으로 기능을 구현하고 확장해 나가는 방식으로 진행됩니다.

### 예시 구조
<pre><code> src/ ├── main/ │ ├── java/ │ │ └── com/example/demo/ │ │ ├── controller/ │ │ ├── domain/ │ │ ├── repository/ │ │ └── service/ │ └── resources/ │ └── application.yml └── test/ </code></pre>
### 학습 목표
- 스프링부트를 활용한 REST API 설계 및 구현
- 프론트엔드와 백엔드의 통신 구조 이해
- AWS에 배포 가능한 웹 서비스 기초 구성
