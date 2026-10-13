package com.example.taskmate.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
    tableName = "tasks"
)
data class Task(


    @PrimaryKey(
        autoGenerate = true
    )
    val id: Int = 0,


    // Judul tugas
    val title: String,


    // Detail tugas
    val description: String,


    // Status tugas selesai atau belum
    val isDone: Boolean = false,


    // Prioritas tugas
    // Low, Medium, High
    val priority: String = "Medium",


    // Deadline tugas
    // Format contoh: 20 Oktober 2026
    val deadline: String = "",


    // Waktu pembuatan task
    val createdAt: Long = System.currentTimeMillis()

)