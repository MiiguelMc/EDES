**Índice**

1. [Encabezados](#hola1)
2. [Cambios de Tipografia](#2)
3. [Lista sin orden](#3)
4. [Lista con orden](#4)
5. [Snippet de código](#5)
6. [Citas](#6)
7. [Enlaces a páginas externas](https://markdownlivepreview.com/)
8. [Enlaces desde el mismo documento](#item2)
9. [Imagen externa](#7)
10. [Imágenes con enlace](#7)
11. [Tablas](#9)
12. [Líneas](#10)
13. [Salto de líneas](#11)
14. [Lista de Tareas](#12)
15. [Emojis](#13)
16. [Referencias](#14)
17. [Referencias al pie](#15)
18. [Fórmulas matemáticas](#16)

## Mi Github(<https://github.com/MiiguelMc/EDES.git/>)

<a name="hola1">

# Ayuda markdown

## Encabezados

### Encabezado 3

#### Encabezado 4

 </a>

## <a name="2"> Texto en Italica </a>

*Texto en italica*  

## <a name="3">Texto en Negrita </a>

**Texto en negrita**  

## <a name="3">Lista desordenada</a>

* Objeto 1
* Lorem ipsum dolor sit amet.
* Lorem ipsum dolor sit amet.
* Lorem ipsum dolor sit amet.

## <a name="4">Linea Ordenada </a>

1. Objeto 1º
2. Objeto 2º
3. Objeto 3º

## <a name="5">Codigo </a>

```

    public static int generarCarta(int a) {
        a = (int) (Math.random() * 40 + 1);
        return a;
    }

    public static int generarDados(int a) {
        a = (int) (Math.random() * 6 + 1);
        return a;
    }
```

## <a name="6">Cita </a>
>
> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer ultricies malesuada lacus vel tincidunt. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vestibulum ante ipsum primis in faucibus orc >

## Redirigido desde Indice

<a name="item2"> hola desde indice </a>

## <a name="7"> Imagen desde enlace  y con enlace  </a>

[![Descripción de la imagen](https://sp-ao.shortpixel.ai/client/to_webp,q_glossy,ret_img,w_150/https://fpalanturing.es/wp-content/uploads/2024/01/CPIFPAT_logotipo_color.webp)](http://www.google.com/)

## <a name="9">Tablas </a>

| Columnas izquierda  | Derecha columnas |
| ------------- |:-------------:|
| izquierda     | derecha    |
| izquierda     | derecha    |
| izquierda     | derecha    |

## <a name="10 ">Linea </a>

---

## <a name="11">Salto de Linea </a>

Salto  
de  
Linea

## <a name="12">Tareas </a>

* [x] Tarea Realizada  
* [ ] Sin realizar

 ---

## <a name="13">Emojis </a>

:pray:

## <a name="14">Referencia </a>

El concepto de [Markdown][1] es esencial para la documentación técnica.

[1]: https://www.markdownguide.org/getting-started/  

## <a name="15">Referencia a pie de pagina  </a>

Markdown es un lenguaje de marcado ligero[^2] que facilita la escritura de texto con formato.  

## <a name="16">Fórmula Matematica </a>

Tiene $a \ne 0$,  $(ax^2 + bx + c = 0)$ Y tambien Tiene
$$ x = {-b \pm \sqrt{b^2-4ac} \over 2a} $$

[^2]: Markdown es un lenguaje creado por John Gruber y Aaron Swartz que se utiliza para formatear texto de manera sencilla y legible.
