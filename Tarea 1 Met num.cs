// See https://aka.ms/new-console-template for more information
//Operaciones matematicas
float numero_1, numero_2, numero_3;
Console.WriteLine("Escribe el valor de 3 numeros en orden");
numero_1 = float.Parse(Console.ReadLine());
numero_2 = float.Parse(Console.ReadLine());
numero_3 = float.Parse(Console.ReadLine());
float Opera_1  = (float)(numero_1 + numero_2 + numero_3);
Console.WriteLine("El resultado de la suma de los 3 numeros es: " +  Opera_1);
float Opera_2 = (float)(numero_1 * numero_2 * numero_3);
Console.WriteLine("El resultado de multiplicar los 3 numeros es: " + Opera_2);
float Opera_3 = (float)(numero_2 % numero_3);
Console.WriteLine("El residuo de la division entre el número 2 y el número 3 es: " + Opera_3);
// Operaciones lógicas
bool contraste_1 = numero_1 == numero_3;
Console.WriteLine("¿El número 1 es igual al número 3? \n " +  contraste_1);
bool contraste_2 = (numero_1 > numero_2) & (numero_1 > numero_3);
Console.WriteLine("¿El número 1 es mayor al númetro 2 y al número 3? \n " + contraste_2);
bool contraste_3 = contraste_1 & contraste_2;
Console.WriteLine("¿Los numeros cumplen las 2 comparaciones? \n " + contraste_3);
