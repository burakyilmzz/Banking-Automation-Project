# Banking Automation Test Suite

Bu proje, **Guru99 Bank** web uygulaması için hazırlanmış bir **Selenium + Java + JUnit** tabanlı otomasyon test projesidir. Projede **Page Object Model (POM)** kullanılmıştır ve test sonuçları **ExtentReports** ile HTML formatında raporlanmaktadır.

---

## 📂 Proje Yapısı

banking-test-suite/
├── src/
│ ├── main/java/com/banking/automation/
│ │ ├── base/ # BaseTest sınıfı
│ │ ├── pages/ # Page Object sınıfları (Login, ManagerHome, Customer, Transaction)
│ │ └── utils/ # DriverManager, ExtentManager
│ └── test/java/com/banking/automation/tests/
│ ├── LoginTest.java
│ ├── CustomerTest.java
│ └── TransactionTest.java
├── test-output/ # Rapor ve screenshot dizini
├── pom.xml # Maven bağımlılıkları
└── README.md


---

## ⚡ Teknolojiler

- Java 20
- Selenium 4.22
- JUnit 4
- WebDriverManager (ChromeDriver otomatik yönetimi)
- ExtentReports (HTML raporlama)

---

## 🛠 Kurulum ve Çalıştırma

1. Projeyi Maven olarak IntelliJ veya Eclipse’e ekleyin.
2. Gerekli dependency’ler `pom.xml` üzerinden otomatik yüklenir.
3. Testleri çalıştırmak için terminal veya IDE üzerinden:


---

## 🔹 Kullanılan Sayfalar

- **LoginPage:** Kullanıcı giriş işlemleri
- **ManagerHomePage:** Yöneticinin ana sayfası, menü navigasyonu
- **NewCustomerPage:** Yeni müşteri ekleme
- **FundTransferPage:** Fon transferi işlemleri
- **BalanceEnquiryPage:** Hesap bakiyesi sorgulama

---

## 🔹 Testler

- **LoginTest:** Geçerli kullanıcı adı ve şifre ile giriş testi
- **CustomerTest:** Yeni müşteri oluşturma testi
- **TransactionTest:** Fon transferi ve bakiye sorgulama testi

---

## 📊 Raporlama

- ExtentReports kullanılarak **test-output/ExtentReport.html** dosyasında rapor oluşturulur.
- Başarısız testlerde isteğe bağlı olarak screenshot eklenebilir.

---

## 💡 Notlar

- WebDriverManager sayesinde ChromeDriver otomatik olarak indirilir, manuel driver indirmeye gerek yok.
- Testler basit ve anlaşılır şekilde hazırlanmıştır, ileri özellikler (wait, error handling, screenshot) eklenebilir.
- Guru99 Bank demo sitesi kullanılmıştır: [http://demo.guru99.com/v4/](http://demo.guru99.com/v4/)
