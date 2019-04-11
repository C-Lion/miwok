/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //onClick listener for openNumbersList
        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on the numbers TextView
        numbers.setOnClickListener(new View.OnClickListener() {
            //The method that executes when the numbers category is clicked on:
            @Override
            public void onClick(View view) {
                Intent openNumbersList = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(openNumbersList);
            }
        });

        //onClick listener for openFamilyMembersList
        // Find the View that shows the Family Members category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on Family Members View
        family.setOnClickListener(new View.OnClickListener() {
            //Code to run when Family Members category is clicked on
            @Override
            public void onClick(View view) {
                Intent openFamilyMembersList = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(openFamilyMembersList);
            }
        });

        //onClick listener for openColorsList
        // Find the View that shows the Colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on Family Members View
        colors.setOnClickListener(new View.OnClickListener() {
            //Code to run when Colors category is clicked on
            @Override
            public void onClick(View view) {
                Intent openColorsList = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(openColorsList);
            }
        });

        //onClick listener for openPhrasesList
        // Find the View that shows the Phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on Family Members View
        phrases.setOnClickListener(new View.OnClickListener() {
            //Code to run when Phrases category is clicked on
            @Override
            public void onClick(View view) {
                Intent openPhrasesList = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(openPhrasesList);
            }
        });
    }
}
