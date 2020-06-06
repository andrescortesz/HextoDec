## HextoDec
>**Javanotes8-linked-Chapter4_Exerecice-2**

The hexadecimal digits are the ordinary, base-10 digits ’0’ through ’9’ plus the letters ’A’ through ’F’. In the hexadecimal system, these digits represent the values 0 through 15, respectively.

*Write a function named hexValue that uses a switch statement to find the hexadecimal value of a given character. The character is a parameter to the function, and its hexadecimal value is the return value of the function.*

You should count lower case letters ’a’ through ’f’ as having the same value as the corresponding upper case letters. If the parameter is not one of the legal hexadecimal digits, return -1 as the value of the function.
A hexadecimal integer is a sequence of hexadecimal digits, such as 34A7, ff8, 174204, or FADE. If str is a string containing a hexadecimal integer, then the corresponding base-10 integer can be computed as follows:

```
    value = 0;
    for(i=0;i<str.length(); i++)
              value = value*16 + hexValue( str.charAt(i) );
```

Of course, this is not valid if str contains any characters that are not hexadecimal digits. Write a program that reads a string from the user. If all the characters in the string are hexadecimal digits, print out the corresponding base-10 value. If not, print out an error message.

--------------
**Discussion:**

Lets define the following steps to solve the exercise:
- Ask the user to input hexadecimal number. // Solicitar al usuario ingresar el numero hexadecimal
    - Use class TextIO to get the entered informaion. Also we capitalize with the method toUpperCase. // Se usa la clase TestIO para tomar la informacion ingresada. También se capitaliza para evitar errores de ingreso.
- Store number. // Almacenar numero.
	- Define a string variable to store the number. // Para almacenar el numero ingresado por el usuario en una variable String.
-  Check each hexadeciaml character. // Verificar que tenga caracteres hexadecimales
	- Define a method (hexValue) converter method using switch. Returns a decimal number of int type. // Se crea un método para verificar cada carácter usando Switch (Retorna numero DECIMAL de tipo entero) 
- Show result. // Mostrar numero convertido.