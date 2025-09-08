# Elementos UI - Android App

Aplicación Android que demuestra el uso de Activities y Fragments con diferentes elementos de interfaz de usuario.

## 🚀 Características

- **5 Fragments** con diferentes elementos UI
- **Navegación** con BottomNavigationView
- **Elementos demostrados**: TextFields, Botones, Selectores, Listas, Elementos de información
- **Diseño moderno** con Material Design
- **Código en Kotlin**

## 📱 Fragments

1. **TextFieldsFragment**: EditText y TextInputLayout
2. **ButtonsFragment**: Button, ImageButton, ToggleButton, MaterialButton
3. **SelectionFragment**: CheckBox, RadioButton, Switch
4. **ListsFragment**: ListView y RecyclerView
5. **InfoFragment**: TextView, ImageView, ProgressBar

## 🛠️ Tecnologías

- Kotlin
- Android Jetpack:
  - Navigation Component
  - ViewBinding
  - Fragments
- Material Design

## 📋 Requisitos

- Android Studio Flamingo o superior
- Android SDK 24+
- Kotlin 1.9.0

## 🔧 Instalación

1. Clonar el repositorio
2. Abrir en Android Studio
3. Sincronizar proyecto con Gradle
4. Ejecutar en emulador o dispositivo físico

## 📸 Capturas de Pantalla
Al abrir la aplicación se nos muestra la siguiente pantalla por defecto.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/bff46c22-5731-4782-80ea-7d688a653b49" width="200" height="500" alt="">
</div>
<br>
<br>
Para probar este fragment llenamos los campos y pulsamos el botón de "Enviar formulario". Nos aparecerá un mensaje de registro exitoso.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/dab1ebf6-803f-4237-9f27-ee286b7b2f7d" width="200" height="500" alt="">
</div>
<br>
<br>
Ahora se selecciona la opción de "botones" del menú que se encuentra en la parte inferior. Se mostrará el siguiente fragment.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/876a816b-3044-469e-97d0-3b98a84a229b" width="200" height="500" alt="">
</div>
<br>
<br>
Al pulsar el "botón normal" aparecerá un mensaje mostrando las veces que se ha pulsado el botón. Al pulsar el "Image button" aparecerá un mensaje diciendo que el botón se pulsó. Al pulsar el "Toggle button" se desactivará el botón y se mostrará un mensaje. Los botones restantes son solo para mostrar la diferencia entre un botón normal y un "material button".
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/258331ea-7014-4718-b794-4ebdffbc76ce" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/ecc2b147-3c39-47c1-81a3-d91001a0e871" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/9a278828-8f45-41a3-b1ea-9eb5559934d4" width="200" height="500" alt="">
</div>
<br>
<br>
La siguiente opción del menú es el fragment de "elementos de selección".
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/7349ca57-313c-42c0-af88-4ca62879a727" width="200" height="500" alt="">
</div>
<br>
<br>
Al seleccionar los elementos de "Checkbox" y "RadioButtons", aparecen mensajes mostrando los elementos seleccionados.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/7ac1689a-751f-4270-bac7-583c1ca3dedc" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/3e945fcd-9b98-44fb-bf7b-0051fa098474" width="200" height="500" alt="">
</div>
<br>
<br>
Al interactuar con el switch, el estado cambia entre "activado" y "desactivado". El botón de "mostrar selección" muestra lo que se tiene seleccionado en el fragment.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/051ac68d-78d4-4921-a7ae-a1d6b3e076ad" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/86ccfa48-9b72-45bb-b636-bd57f5fcdf62" width="200" height="500" alt="">
</div>
<br>
<br>
La siguiente opción del menú es el fragment de "Listas".
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/44a606d4-571d-4097-b512-7c53e32977a0" width="200" height="500" alt="">
</div>
<br>
<br>
Al interactuar con ambas listas se puede ver su diferencia, ya que en "ListView" se ve una barra vertical de desplazamiento, mientras que en "RecycleView" no se muestra. Al pulsar un elemento en ambas listas, aparece un mensaje mostrando el elemento que se pulsó.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/18904589-12d7-4cac-84c6-79fb107a3242" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/4d063707-dfcd-4588-a277-6c9356a1faa3" width="200" height="500" alt="">
</div>
<br>
<br>
La última opción del menú es "Elementos de información".
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/67fea633-1e10-48f8-8ff4-ecb4492d2f86" width="200" height="500" alt="">
</div>
<br>
<br>
Al interactuar con textView aparece un mensaje diciendo que el texto se a pulsado. Al pulsar la imagen del imageView esta se atenua. Al interactuar con la ProgressBar podemos ver como la barra va cambiando de color hasta llegar al 100% y se reinicia al pulsar el botón de reiniciar.
<br>
<br>
<div align="center">
  <img src="https://github.com/user-attachments/assets/1a8e22d3-e2b7-419c-a12e-bfa67fc9badb" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/e0fbaac5-5917-43fb-ad9a-33c318eabb12" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/6f683eb6-b7e6-4276-b935-6801ff42db54" width="200" height="500" alt="">
  <img src="https://github.com/user-attachments/assets/8c8b8c7f-0339-42c1-ac62-7f7a461f6fc8" width="200" height="500" alt="">
</div>
<br>
<br>

## 👨‍💻 Autor

- Alumno: Toral Alvarez Yael Adair
- Materia: Desarrollo de aplicaciones móviles nativas
- Grupo: 7CV2

## 📄 Licencia

Este proyecto es con fines educativos.
