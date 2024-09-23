package com.example.mju_mobileprogramming

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    open fun switchOff() {
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone : Phone(){
    var isFolder: Boolean = true

    override fun switchOn(){
        if(!isFolder){
            isScreenLightOn = true
        }
        else{
            isScreenLightOn = false
        }
    }
    fun fold(){
        isFolder = true
        isScreenLightOn = false
    }
    fun unfold(){
        isFolder = false
        isScreenLightOn = true
    }
}

fun main() {
    val newFoldablePhone = FoldablePhone()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}