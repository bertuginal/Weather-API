
<!-- ABOUT THE PROJECT -->
<h1 style="text-align:center;">Patika+ Weather API</h1>

This project is a weather API project that communicates with the OpenWeatherMap API based on user input. The purpose of this service is to display daily, weekly and monthly weather forecasts based on country and city information.

![logo](https://github.com/bertuginal/Weather-API/assets/73167951/114fcc84-e7f9-42b6-8721-043993cc8fe0)


## 🔎 Overview
The Weather API service is designed to retrieve the required weather data by OpenWeatherMap by processing requests from users. Spring Boot (Spring Web, Devtools, Lombok) technology and Maven library were used in this project.


&nbsp; 

## 🚀 How does it work?
❶ To access OpenWeatherMap's servers and retrieve weather data, a free Weather API Key is created by logging in to the OpenWeatherMap page.
  
❷ In order to learn the weather conditions of a particular place, country code and city name information is obtained from the user and latitude and longitude coordinates, called geo codes, are determined.

❸ Requests are sent back to OpenWeatherMap with the Rest Template class, which makes it easier for us to send requests back according to the specified latitude and longitude coordinates.
  
❹ From the request sent to OpenWeatherMap, the weather forecast, temperature and description are responded according to the coordinates specified by the user.


&nbsp; 

## 🛠️ Built With

* [![Java][Java-logo]][Java-url]
* [![Spring][Spring-logo]][Spring-url]
* [![Maven][Maven-logo]][Maven-url]
* [![Rest][Rest-logo]][Rest-url]

<b> ✔️ JDK-21 was used in Java and Spring Web, Devtools, Lombok was used in Spring Boot. </b>


&nbsp; 

## ↓ Installation ↓

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Get a free API Key at
   ```sh
   https://home.openweathermap.org/api_keys
   ```
2. Clone the my repo
   ```sh
   git clone https://github.com/bertuginal/Weather-API.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```
   

&nbsp; 

<!-- FEATURES -->
## ✨ Features

- [x] Users can input a country and city to get the current weather and forecasts.
- [x] The service can provide daily, weekly, and monthly weather forecasts based on user preferences.
- [x] Robust error handling ensures graceful degradation in case of issues with external API communication or invalid user inputs.
- [x] Comprehensive validation of input parameters to ensure data integrity and reliability.

✔️ See the [open issues](https://github.com/bertuginal/Weather-API/issues) for a full list of proposed features (and known issues)!
   

&nbsp; 

<!-- CONTRIBUTING -->
## 🌱 Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
⭐ Don't forget to give the project a star! Thanks again! ⭐

❶ Fork the Project

❷ Create your Feature Branch (`git checkout -b feature/WeatherApi`)

❸  Commit your Changes (`git commit -m 'Add some WeatherApi'`)

❹  Push to the Branch (`git push origin feature/WeatherApi`)

❺ Open a Pull Request
   

&nbsp; 

<!-- CONTACT -->
## ☎️ Contact

📧 E-mail: [bertuginal@yahoo.com](mailto:bertuginal@yahoo.com)

📱 Mobile Phone: [(+90) 507 038 33 23](mailto:+905070383323)

📋 Project Link: [https://github.com/bertuginal/Weather-API](https://github.com/bertuginal/Weather-API)




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png

[Java-logo]: https://img.shields.io/badge/java-000000?style=for-the-badge&logo=spring&logoColor=white
[Java-url]: https://www.java.com/tr/
[Spring-logo]: https://img.shields.io/badge/Spring_Boot-DD0031?style=for-the-badge&logo=springboot&logoColor=white
[Spring-url]: https://spring.io/
[Maven-logo]: https://img.shields.io/badge/maven-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[Maven-url]: https://maven.apache.org
[Rest-logo]: https://img.shields.io/badge/Rest_Template-563D7C?style=for-the-badge&logo=rest&logoColor=white
[Rest-url]: https://img.shields.io/badge/Rest_Template-563D7C?style=for-the-badge&logo=rest&logoColor=white

[React.js]: https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB
[React-url]: https://reactjs.org/
[Vue.js]: https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D
[Vue-url]: https://vuejs.org/
[Angular.io]: https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Svelte.dev]: https://img.shields.io/badge/Svelte-4A4A55?style=for-the-badge&logo=svelte&logoColor=FF3E00
[Svelte-url]: https://svelte.dev/
[Laravel.com]: https://img.shields.io/badge/Laravel-FF2D20?style=for-the-badge&logo=laravel&logoColor=white
[Laravel-url]: https://laravel.com
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[JQuery.com]: https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white
[JQuery-url]: https://jquery.com 
