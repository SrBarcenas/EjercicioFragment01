package com.example.ejerciciofragments.utils

import com.example.ejerciciofragments.models.Mail
import kotlin.random.Random

object Util {

    val colors = arrayOf(
        "ff5733", "885449", "1bbd19", "1981bd", "6c549b"
    )

    fun getDummyData(): List<Mail> {
        return listOf(
            Mail("Presupuesto 2023", "Hola Alejandro, este es el presupuesto para el año 2017 del que mencionaste en la reunión de ayer. Está en formato PDF, ya me dices que te parece. Un Saludo", "antonio@gmail.com"),
            Mail("Cena Empresa", "Queridos amigos, la cena de empresa de este año será en el mismo restaurante que los años pasados, sin embargo la hora será distinta, empieza sobre las 8 de la tarde. Espero verte allí, Saludos.", "empresa@gmail.com"),
            Mail("Partida Tenis", "ey Alex, ¿Cuándo dijiste que íbamos a ir a jugar ese torneo de tenis? Deberíamos entrenar antes del primero partido, ya me dices.", "maria@gmail.com"),
            Mail("Oferta de empleo: Android developer", "Hola, estamos buscando desarrolladores Android sin experiencia, en un ambiente dinámico donde se valora el compañerismo, el esfuerzo y las ganas por aprender. Si sientes que eres el candidato perfecto para ello, mándame tu CV a éste mismo correo y consideramos tu perfil en el proceso de entrevistas. Gracias.", "monica@gmail.com"),
            Mail("Quedada amigos", "woooooo, hace semanas que no quedamos todos juntos, como te viene este finde?", "luis@gmail.com"),
            Mail("Compra conjunta de shishas", "Bueno, al final somos 10, vamos a pedir las shishas que ya habíamos acordado. El pedido empezará al final del mes de Febrero, para entonces, si no has hecho la transferencia, no se procederá a pedir la tuya. Si necesitas los datos bancarios, avísame ;)", "carlos@gmail.com"),
            Mail("Cursos 2023", "Cuñado, he visto unos cursos muy interesantes sobre programación. Pásate por mi casa hoy y le echamos un vistazo!", "rafael@gmail.com"),
            Mail("Conferencia de lectores", "El lugar elegido para la conferencia de lectores internacional celebrada el día 29 de Febrero será en Sevilla. Visita nuestra página web para tener más detalles del evento.", "osvaldo@gmail.com"),
            Mail("Adopta a un perro, será tu amigo", "Recuerda que los animales no son juguetes, que tienen sentimientos y debes cuidar de ellos. Muchos son abandonados, pásate por nuestras instalaciones y acoge a uno de estos necesitados animalitos que tanto añoran un hogar. Son encantadores!!", "jose@gmail.com"),
            Mail("Repara tus piezas, 50% dto", "Aprovecha las nuevas ofertas del 50% descuento que tenemos en todos nuestros artículos", "reparaciones@gmail.com"),
        )
    }

    fun getRandomColor(): String {
        val randomNumber = Random.nextInt(colors.size) + 0
        return colors[randomNumber]
    }
}