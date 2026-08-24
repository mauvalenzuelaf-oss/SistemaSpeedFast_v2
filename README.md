![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Semana 2 - Actividad Formativa 2 - Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto

* **Nombre completo:** Mauricio Francisco Valenzuela Fuentes
* **Carrera:** Analista Programador Computacional
* **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la **Actividad Formativa N° 2** de la asignatura **Desarrollo Orientado a Objetos II**. 

Se trata de la segunda etapa de **SistemaSpeedFast**, una aplicación desarrollada en Java que representa la gestión de distintos tipos de pedidos para la empresa ficticia SpeedFast, dedicada al reparto a domicilio.

En esta versión, el sistema permite calcular el **tiempo estimado de entrega** de tres tipos de pedidos:

* **Pedido de comida:** considera un tiempo base de 15 minutos más 2 minutos por cada kilómetro de distancia.
* **Pedido de encomienda:** considera un tiempo base de 20 minutos más 1,5 minutos por cada kilómetro, ajustando el resultado a un valor entero.
* **Pedido express:** considera un tiempo base de 10 minutos y agrega 5 minutos adicionales cuando la distancia supera los 5 kilómetros.

El proyecto aplica conceptos de Programación Orientada a Objetos, principalmente:

* Clases abstractas.
* Herencia.
* Polimorfismo.
* Sobrescritura de métodos.
* Encapsulamiento.
* Reutilización de código.

La clase `Pedido` funciona como una **clase abstracta base**, concentrando los atributos y comportamientos comunes de los distintos tipos de pedidos. Contiene el método concreto `mostrarResumen()` y declara el método abstracto `calcularTiempoEntrega()`, cuya implementación es definida de forma específica por cada subclase.

---

## 🧱 Estructura general del proyecto

```text
📁 SistemaSpeedFast_v2/
│
├── 📁 src/
│   ├── 📁 app/
│   │   └── Main.java
│   │
│   └── 📁 model/
│       ├── Pedido.java
│       ├── PedidoComida.java
│       ├── PedidoEncomienda.java
│       └── PedidoExpress.java
│
├── 📄 .gitignore
│
├── 📄 SistemaSpeedFast_v2.iml
│
└── 📄 README.md
```

---

## 🧩 Organización por paquetes

El proyecto se encuentra organizado en dos paquetes principales:

### 1. `app`

Contiene la clase encargada de iniciar y ejecutar el programa.

#### `Main.java`

Instancia los distintos tipos de pedidos mediante referencias del tipo base `Pedido`, ejecuta el método `mostrarResumen()` y obtiene el tiempo estimado mediante `calcularTiempoEntrega()`.

De esta forma, permite demostrar el uso de **herencia, abstracción y polimorfismo** dentro de la jerarquía de pedidos.

### 2. `model`

Contiene las clases que representan la jerarquía de pedidos del sistema.

#### `Pedido.java`

Clase abstracta base que contiene los atributos comunes:

* `idPedido`
* `direccionEntrega`
* `distanciaKm`

Además, implementa el método concreto `mostrarResumen()` y declara el método abstracto `calcularTiempoEntrega()`.

#### `PedidoComida.java`

Representa los pedidos de comida e implementa el cálculo del tiempo estimado considerando:

```text
15 minutos + 2 minutos por kilómetro.
```

#### `PedidoEncomienda.java`

Representa los pedidos de encomienda e implementa el cálculo del tiempo estimado considerando:

```text
20 minutos + 1,5 minutos por kilómetro.
```

El resultado del cálculo se ajusta a un valor entero.

#### `PedidoExpress.java`

Representa los pedidos express e implementa un tiempo base de 10 minutos.

Cuando la distancia supera los 5 kilómetros, se agregan 5 minutos adicionales al tiempo estimado.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/mauvalenzuelaf-oss/SistemaSpeedFast_v2.git
```

2. Abre **IntelliJ IDEA**.

3. Selecciona la opción `Open`.

4. Busca y selecciona la carpeta descargada que lleva por nombre `SistemaSpeedFast_v1`.

5. Verifica que el código fuente se encuentre dentro de la carpeta `src`.

6. Confirma que dentro de `src` se encuentren los paquetes:

```text
app
model
```

7. Abre la clase principal:

```text
src/app/Main.java
```

8. Ejecuta el método `main()`.

---

## 🖥️ Ejemplo de funcionamiento

```text
PedidoComida #001
Dirección: Av. Italia 456
Distancia: 4 km
Tiempo estimado de entrega: 23 minutos

PedidoEncomienda #002
Dirección: Av. Independencia 123
Distancia: 6 km
Tiempo estimado de entrega: 29 minutos

PedidoExpress #003
Dirección: Av. Apoquindo 1500
Distancia: 7 km
Tiempo estimado de entrega: 15 minutos
```

---

**Repositorio GitHub:**
https://github.com/mauvalenzuelaf-oss/SistemaSpeedFast_v2

**Fecha de entrega:** 24/08/2026
