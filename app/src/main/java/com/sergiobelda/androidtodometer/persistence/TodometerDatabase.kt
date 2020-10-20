/*
 * Copyright 2020 Sergio Belda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sergiobelda.androidtodometer.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sergiobelda.androidtodometer.databaseview.ProjectTaskView
import com.sergiobelda.androidtodometer.model.Project
import com.sergiobelda.androidtodometer.model.Task

@Database(
    entities = [Project::class, Task::class],
    views = [ProjectTaskView::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class TodometerDatabase : RoomDatabase() {

    abstract fun projectDao(): ProjectDao

    abstract fun taskDao(): TaskDao

    abstract fun projectTaskViewDao(): ProjectTaskViewDao
}
