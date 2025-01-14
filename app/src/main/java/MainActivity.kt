package com.example.nativemobiledev

open class AnimeCharacter(val name: String, val powerLevel: Int, val isHero: Boolean) {
    open fun introduce() {
        val role = if (isHero) "hero" else "villain"
        println("Hello, my name is $name and I am a $role with a power level of $powerLevel.")
    }
}

data class Weapon(val name: String, val damage: Int) {
    fun use() {
        println("$name deals $damage damage.")
    }
}





fun main() {
////task 1
    val hero = AnimeCharacter("Goku", 9001, true)
    val villain = AnimeCharacter("Frieza", 8500, false)

    hero.introduce()
    villain.introduce()

// task 2
    val weapon = Weapon("⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⣶⣤⣤⣤⣤⣶⣶⣶⣶⣶⣶⣦⣤⣤⡀⠀⠀⣶⠀\n" +
                              "⢸⣿⣿⣿⣿⣿⣿⡿⢿⣿⡿⠟⢻⣿⣿⡟⠛⠛⠛⠉⠙⠛⠋⠀⠈⠉⠀⠈⠉⠁\n" +
                              "⢸⣿⠿⠟⠋⠉⠀⢀⣾⡿⠉⠀⠈⠸⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                              "⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠹⣿⣷⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                              "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀", 100)
    weapon.use()


}














//task 3
class HumanCharacter(name: String, powerLevel: Int, isHero: Boolean, var weapon: Weapon?) : AnimeCharacter(name, powerLevel, isHero) {
    override fun introduce() {
        val weaponInfo = weapon?.let { " and  ${it.name} which deals ${it.damage} damage" } ?: ""
        val role = if (isHero) "hero" else "villain"
        println("Hello, my name is $name and I am a $role with a power level of $powerLevel $weaponInfo.")
    }
}
//fun main() {
//    val sr = Weapon("▄︻デ══━一\uD83D\uDCA5", 100)
//    val humanCharacter = HumanCharacter("Maksat", 775, true, sr)
//
//    humanCharacter.introduce()
//}

