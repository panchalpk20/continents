package com.example.continents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {



//-------------Variable Declarations-----------------------

    String cont;
    int map;
    String desc, population, area, name;
    String countries;
//-----------------------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        try{
            this.getSupportActionBar().hide();
        } catch (Exception e){
            log("Excp::::;" +e.getMessage());
        }

        setContentView(R.layout.activity_main);
    }



    public void openContinent(View view) {
        cont = view.getTag().toString();
     //   log("country::"+continent);


        switch (cont){
            case "North America" :
                log("countinent nA");

                name = "North America";
                map = R.drawable.na;
                countries = "23";
                desc = "North America has five time zones and is the only continent with every type of climate\n" +
                        "North America was named after the explorer Americo Vespucci and is also known as the \"New World\"\n" +
                        "Of the seven continents of the world, North America's population density at 22.9 per square kilometre is the highest\n" +
                        "The largest fresh water lake in the world -- Lake Superior - is located in this continent\n";
                population = "579,024,000";
                area = "24,709,000 sq km";


                break;
            case "South America":
                log("  continnt SA");


                name = "South America";
                map = R.drawable.sa;
                desc = "The world's largest river as per water volume and the second longest (6440 km) -- the Amazon -- is in South America\n" +
                        "This continent houses the world's highest waterfalls -- the Angel Falls\n" +
                        "The world's largest snake and the second longest -- the green anaconda -- also resides in South America\n" +
                        "The highest volcanoes of the world -- Mt. Cotopaxi and Mt. Chimborazo -- are found on this continent\n" +
                        "The major languages spoken on this continent are Portuguese and Spanish\n";
                countries ="12";
                population = "422,535,000";
                area = "17,840,000 sq km";


                break;
            case "Europe":
                log("  continnt Europe");

                name = "Europe";

                map = R.drawable.europe;
                desc = "Europe and Asia are parts of the same major landmass -- Europe is separated from Asia by the Ural mountains and the Caspian Sea\n" +
                        "The highest mountain in this continent is Mt. Elbrus\n" +
                        "Europe is surrounded by water on three sides -- Mediterranean Sea in the south, Atlantic Ocean in the west, and Arctic Ocean in the north\n" +
                        "The world's smallest country, the Vatican City, is in Europe. " +
                        "Three-fourth of the world's potatoes grow in Europe. " +
                        "The Volga is the longest river in Europe\n";
                countries = "50";
                population = "738,849,000";
                area = "10,180,000 sq km";


                break;
            case "Asia":
                log("  continnt Asia");
                name = "Asia";
                map = R.drawable.asia;
                desc = "Asia is the world's largest continent of the seven continents in size and population\n" +
                        "Asia covers one-third of earth's surface. " +
                        "It has 30 per cent of world land area and 60 per cent of population\n" +
                        "It contains the world's largest country, Russia, and the world's two most populous countries, China and India\n" +
                        "Asia houses the highest point on earth - the summit of Mount Everest, which is 29,028 ft. (8,848 m) tall\n" +
                        "The religions of Hinduism, Islam, Buddhism, Christianity first began in Asia\n" +
                        "The major animals found in Asia are -- reticulated pythons, tiger, panda, yaks, Indian rhinoceroses";
                population = "4,436,224,000";
                countries = "48";
                area = "44,579,000 sq. km";


                break;
            case "Africa":
                log("  continnt Africa");

                name = "Africa";
                map = R.drawable.africa;
                desc = "Of the seven continents of the world, Africa is the second largest\n" +
                        "The continents terrain was inhabitable and remained unknown for thousands of years, earning it the name of 'Dark Continent'\n" +
                        "The world's longest river -- the Nile -- and the world's largest desert -- the Sahara -- both are home in Africa\n" +
                        "The world's hottest place -- Ethiopia -- is in Africa\n" +
                        "As per research evidence, Africa is the place where Homo sapiens originated and then migrated to all the other continents of the world\n" +
                        "More than 50 per cent of the world's gold and 95 per cent of the world's diamonds come from the mineral rich continent of Africa\n" +
                        "The major animals in Africa include -- cheetah, African elephant, lion, zebra, Egyptian mongoose, giraffe, addax";
                countries = "54";
                population = " 1,216,130,000";
                area = "30,221,532 sq km";

                break;
            case "Australia":
                log("  continnt Australia");

                name = "Australia";
                map = R.drawable.austreliya;
                desc = "Australia is the world's smallest continent and is also known as an 'island continent' as it is surrounded by water on all sides\n" +
                        "The continent of Australia is often called Sahul, Australinea or Meganesia to differentiate it from the country of Australia\n" +
                        "The name Australia comes from the Latin word 'australis' meaning 'southern'\n" +
                        "Of all the continents in the world, Australia stands at the top of wool production and import. This is because the sheep population in the world's smallest continent is 14 times that of its human population\n" +
                        "Austria is home to over 500 varieties of eucalyptus trees\n" +
                        "Two-thirds of Australia is desert land. " +
                        "The world's largest coral reef -- the Great Barrier Reef -- is around 2000 kilometres long. " +
                        "The unique animals of Australia are -- kangaroo, emu, platypus";
                countries ="3";
                population = "39,901,000";
                area = " 8,525,989 sq km";

                break;


            case "Antarctica":
                log("  continnt Antarctica");

                name = "Antarctica";
                map = R.drawable.antartica;
                desc = "Antarctica is not only the coldest place on Earth but also the highest, driest, windiest and emptiest\n" +
                        "Before 1840, Antarctic was called 'Terra Australis Incognita' which meant 'the unknown southern land'\n" +
                        "Antarctica sees half a year of light and half a year of complete darkness - summer months of December to February give 24 hours of light, while the winter months of late March to late September are pitch dark the whole day\n" +
                        "Summer temperatures in the Frozen Continent are around -35 degree C in the interior and 2 degree C at the coasts. In the winters, it is -70 degree C in the interior and 2 degree C at the coasts\n" +
                        "The only permanent settlements in Antarctica are the research bases where scientists from different countries come to do their work\n" +
                        "Penguins are home in Antractica and Adelie penguins are the most common kind found here";
                countries ="0";
                population = "1,106";
                area = "14,000,000 sq km";


                break;
        }

        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("map", map);
        i.putExtra("population", population);
        i.putExtra("area", area);
        i.putExtra("description", desc);
        i.putExtra("countries", countries);
        i.putExtra("name", name);
        startActivity(i);
    }



    private void log(String s) {

        Log.e("","Log:::"+s);

    }
}
