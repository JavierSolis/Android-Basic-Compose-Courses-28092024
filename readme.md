
<img src="android_compose_head.png" alt="android jetpack compose android basics" style="width:100%;"/>

# Courses Android Compose Basic - Solution Code #AndroidBasics

# Training > Android Basics with Compose > Building App UI > IU y estado > 4/Courses

---

Solution code for the Android Basics with Compose

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-grid?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-2%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-grid#0

# Description

------------


## [1\. Antes de comenzar](https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-grid?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-2%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-grid#0)

¡Felicitaciones! Compilaste tu primera app con una lista desplazable. Ya puedes poner en práctica lo que aprendiste.

Este ejercicio se centra en la creación de los componentes necesarios para crear una lista desplazable. El material amplía lo que aprendiste en el codelab [Cómo agregar una lista desplazable](https://developer.android.com/codelabs/basic-android-kotlin-compose-training-add-scrollable-list?hl=es-419) y te permite aplicar ese conocimiento para crear una cuadrícula del mismo estilo.

Es posible que en algunas secciones se requiera que uses modificadores o funciones de componibilidad que no hayas visto antes. En esos casos, consulta las Referencias disponibles para cada problema, en las que puedes encontrar vínculos a documentación relacionada con los modificadores, las propiedades y las funciones de componibilidad que no conoces. Puedes leer la documentación y determinar cómo incorporar los conceptos en la app. La capacidad de comprender la documentación es una habilidad esencial que debes desarrollar para aumentar tus conocimientos.

El código de la solución estará disponible al final, pero intenta resolver los ejercicios antes de comprobar las respuestas. Considera la solución como una forma de implementar la app.

## Requisitos previos

*   Completa el trabajo de curso Aspectos básicos de Android en Compose a través del [codelab Cómo agregar una lista desplazable](https://developer.android.com/codelabs/basic-android-kotlin-compose-training-add-scrollable-list?hl=es-419).

## Requisitos

*   Una computadora con acceso a Internet y Android Studio instalado

### Recursos

Necesitarás los siguientes recursos para completar el código de estos problemas prácticos.

*   [Imágenes por tema](https://github.com/google-developer-training/basic-android-kotlin-compose-training-courses/blob/main/topics.zip) Estas imágenes representan cada tema de la lista.
*   [ic\_grain.xml](https://raw.githubusercontent.com/android/compose-samples/main/Owl/app/src/main/res/drawable/ic_grain.xml) Este es el ícono decorativo que aparece junto a la cantidad de cursos del tema.

## Qué compilarás

En estos problemas prácticos, compilarás la app de Courses desde cero. La app de Courses muestra una lista de temas de cursos.

Los problemas prácticos se dividen en secciones, en las que compilarás lo siguiente:

*   Una clase de datos sobre temas del curso

Los datos del tema tendrán una imagen, un nombre y la cantidad de cursos asociados a ese tema.

*   Una función de componibilidad para representar un elemento de la cuadrícula de temas del curso:

Cada elemento del tema mostrará la imagen, el nombre, la cantidad de cursos asociados y un ícono decorativo.

*   Una función de componibilidad para mostrar una cuadrícula de esos elementos del tema del curso

La app final se verá de la siguiente manera:

![97c449bee4a2029d.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-practice-grid/img/97c449bee4a2029d.png?hl=es-419)