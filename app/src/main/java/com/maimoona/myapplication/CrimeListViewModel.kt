package com.maimoona.myapplication

import androidx.lifecycle.ViewModel

class CrimeListViewModel :ViewModel(){
    val crimes = mutableListOf<Crime>()
    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime;
            crime.requiresPolice = when ((0..1).shuffled().first()) {
                0 -> false
                else -> true
            }
            crimes += crime
        }
    }
}