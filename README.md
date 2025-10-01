# Calculadora con MVC y GUI

Este proyecto es una **calculadora** desarrollada en Java utilizando el patrón de diseño **MVC (Modelo-Vista-Controlador)** y un diseño intuitivo utlizando **GUI**. La interfaz gráfica está implementada con **Swing** y tiene un estilo inspirado en la calculadora del iPhone.

> **Proyecto universitario realizado como parte de la formación académica en la asignatura programación orientada a objetos (2025-2, G1).**

## Características

- Operaciones básicas: suma, resta, multiplicación y división.
- Interfaz gráfica moderna y responsiva.
- Separación clara entre modelo, vista y controlador.
- Código fácil de entender y extender.

## Estructura del proyecto

```
src/
├── main/
│   └── Main.java
├── modelo/
│   ├── Operacion.java
│   ├── Suma.java
│   ├── Resta.java
│   ├── Multiplicacion.java
│   └── Division.java
├── view/
│   └── CalculadoraView.java
└── controlador/
└── CalculadoraControlador.java
```

## Cómo ejecutar

1. Clona este repositorio:
    ```bash
    git clone https://github.com/SamDkron/calculadora-con-mvc.git
    ```
2. Compila el proyecto:
    ```bash
    javac -d bin src/modelo/*.java src/vista/*.java src/controlador/*.java
    ```
3. Ejecuta la calculadora:
    ```bash
    java -cp bin vista.Main
    ```
## Cómo usar la calculadora

1. Haz clic en los números
2. Selecciona una operación (+, -, *, /)
3. Ingresa el segundo número
4. Presiona = para ver el resultado
5. Presiona C para limpiar

## Características

- Interfaz gráfica con tema oscuro
- Protección contra división por cero
- Botón de limpieza (C)
- Arquitectura MVC

## Notas

Si intentas dividir por cero, aparecerá "ERROR!!!" en la pantalla
El botón C reinicia la calculadora a su estado inicial

## Autor

- [SamDkron](https://github.com/SamDkron) "Samuel David Dau Fernandez"

## Licencia

Este proyecto está bajo la licencia MIT.

**UNIVERSIDAD DEL MAGDALENA**