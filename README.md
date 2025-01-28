# Hesap Makinesi - Jetpack Compose ile Geliştirilmiş

Bu proje, Jetpack Compose kullanılarak temel aritmetik işlemleri gerçekleştiren bir hesap makinesi uygulamasıdır...

## 🎯 Özellikler
- **Toplama, Çıkarma, Çarpma ve Bölme** işlemleri.
- Dinamik ve duyarlı bir kullanıcı arayüzü.
- Kullanıcı girişine göre otomatik durum güncellemeleri.
- Maksimum 8 basamaklı sayı giriş limiti.

## 📂 Proje Yapısı
- **UI Bileşenleri**
  - `Calculator`: Hesap makinesinin ana ekranı ve düğmeleri.
  - `CalculatorButton`: Düğme bileşenleri.
- **Durum Yönetimi**
  - `CalculatorState`: Hesap makinesinin mevcut durumu.
  - `CalculatorViewModel`: Kullanıcı aksiyonlarını işleyen ve durumu güncelleyen sınıf.
- **Aksiyonlar**
  - `CalculatorActions`: Kullanıcı tarafından tetiklenen eylemleri temsil eder.
  - `CalculatorOperation`: Matematiksel işlemleri temsil eder.

## 🛠️ Kullanılan Teknolojiler
- **Kotlin**: Projenin temel programlama dili.
- **Jetpack Compose**: Modern ve duyarlı bir kullanıcı arayüzü oluşturmak için kullanıldı.
- **MVVM Mimari**: Uygulamanın yönetimi için kullanıldı.

## 🚀 Kurulum ve Çalıştırma
1. Projeyi klonlayın:
   ```bash
   git clone https://github.com/esmanureral/JetpackCompose-HesapMakinesi.git
   
