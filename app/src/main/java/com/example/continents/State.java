package com.example.continents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class State extends AppCompatActivity {
    String capitl, noOfDist, name, desc, area;
    ScrollView scrollView, descScroll;

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

        setContentView(R.layout.activity_state);

        TextView desc, noOfDist, area, head, capital;
        desc = findViewById(R.id.desc);
        noOfDist = findViewById(R.id.noOfDist);
        area = findViewById(R.id.area);
        head = findViewById(R.id.heading);
        capital = findViewById(R.id.capital);
        ScrollingMovementMethod sm = new ScrollingMovementMethod();
        desc.setMovementMethod(new ScrollingMovementMethod());
        descScroll = findViewById(R.id.descScroll);
        descScroll.setSmoothScrollingEnabled(true);
        scrollView = findViewById(R.id.myScroll);
        scrollView.setSmoothScrollingEnabled(true);

        head.setText(getIntent().getStringExtra("name"));
        capital.setText(String.format("Capital: %s", getIntent().getStringExtra("capital")));
        desc.setText(getIntent().getStringExtra("desc"));
        noOfDist.setText(String.format("Total districts: %s", getIntent().getStringExtra("dists")));
        area.setText(String.format("Area: %s", getIntent().getStringExtra("area")));


    }

    private void log(String s) {
        Log.e("","logging from state.java::" +s);
    }




    public void goState(View view){
        //Log.e("","state :: "+view.getTag());

        String state = (String) view.getTag();

        switch (state){
            case "Andra_Pradesh" :
                log("state : Andra_Pradesh");
                name = "Andra Pradesh";
                area = "162,968";
                capitl = "Amaravati";
                noOfDist= "13";
                desc = "Andhra Pradesh is the third largest state in India and it forms the major link " +
                        "between the north and the south of India. It is the biggest and most populous " +
                        "state in the south of India. Andhra Pradesh lies between 12o41' and 22o longitude and " +
                        "77o and 84o40' latitude. It is bounded by Madhya Pradesh and Orissa in the north, the Bay of Bengal in " +
                        "the east, Tamil Nadu and Karnataka in the south and Maharashtra in the west. The state " +
                        "is dotted with hill ranges from the north to the south, running erratically down the middle " +
                        "of the country dividing it into western and eastern or coastal Andhra. ";
                break;

            case "Arunachal_Pradesh" :
                log("state : Arunachal_Pradesh");

                name = "Arunachal Pradesh";
                capitl = "Itanagar";
                area = "83,743";
                noOfDist= "21";
                desc = "Arunachal Pradesh is a thinly populated hilly tract lying on the north-east extremity" +
                        " of India comprising roughly 83,573 square kilometers. The Pradesh is " +
                        "known to be rich  in flora, fauna, power and mineral potential. Previously this region " +
                        "was known as the North East Frontier Agency (NEFA) and constituted a part of the state of " +
                        "Assam. Arunachal Pradesh became an independent state on 20th February 1987." +
                        " It is bounded by independent countries on the three sides and by Assam and Nagaland in " +
                        "the south. The long international border comprises of Bhutan on its west (160 km)," +
                        " the Tibet region of China on its northern and north east border (1080 km) " +
                        "and Myanmar (formerly Burma (440km) on the eastern border.  ";
                break;
            case "Assam" :
                log("state : Assam");

                name = "Assam";
                capitl = "Dispur";
                area = "78,438";
                noOfDist= "33";
                desc = "Initially, Shillong was the capital of Assam but got replaced by Dispur in 1972\n" +
                        "Assam, a northeastern state of India, is a land of exquisite flowers and rare wild animals. " +
                        "Renowned for its tea, wildlife and silk, Assam is a state with rich biodiversity. " +
                        "With its capital at Dispur, a suburb of the city Guwahati, it encompasses the Brahmaputra, the " +
                        "Barak river valleys, the Karbi Anglong, and the North Cachar Hills. Assam is bordered by the " +
                        "rest of the Seven Sister States: Arunachal Pradesh, Nagaland, Manipur, Mizoram, Tripura and Meghalaya. It also " +
                        "shares International borders with Bhutan and Bangladesh. The native and official languages of the state are A" +
                        "ssamese and Bodo."
                ;

                break;
            case "Bihar" :
                log("state : Bihar");

                name = "Bihar";
                capitl = "Patna";
                area = "94,163";
                noOfDist= "38";
                desc = "Bihar, formerly known as Magadha, was once the center power of India's struggle for " +
                        "Independence. The Name Bihar is derived from the Sanskrit word, 'Vihara' which means monasteries. " +
                        "The place was also an important center of Education, culture and tradition. The very ancient university " +
                        "Nalanda is situated in Bihar and its ruins can still be seen there. It is " +
                        "a rich and fertile land with a mild climate and is crossed by many major rivers, including the " +
                        "Ganges. Bihar is bounded on the north by Nepal, on the south by Jharkhand, on the east by " +
                        "West Bengal and on the west by Uttar Pradesh";

                break;
            case "Chhattisgarh" :
                log("state : Chhattisgarh");


                name = "Chhattisgarh";
                capitl = "Raipur";
                area = "135,191";
                noOfDist= "27";
                desc = "The new State Chhattisgarh, formerly a part of Madhya Pradesh was formed on November " +
                        "1, 2000 as the 26th state of the Indian Union. This was the day exactly 44 years" +
                        ", since Madhya Pradesh came into being. The districts of the state are Koriya, Sarguja, Jashpur" +
                        ", Bilaspur, Korba, Raigarh, Champa, Mahasamund, Raipur, Kawardha, Durg, Rajnandgaon, Kanker, " +
                        "Dhamtari, Bastar and Dantewara, with Raipur as the capital. Dinesh Nandan Sahai was appointed the Governor " +
                        "and Ajit Jogi of the Congress party became the Chief Minister of the state.";


                break;
            case "Goa" :
                log("state : Goa");


                name = "Goa";
                noOfDist= "2";
                area = "3,702";
                capitl = "Panji";
                desc = "Goa, a tiny state, known as the 'Tourist Paradise of India' enjoys a renowned place in the traveler'" +
                        "s guide. Situated on the west coast of the country, the state was liberated from " +
                        "Portuguese rule in 1961 and became a part of the Indian Union territory along with Daman " +
                        "and Diu. It became the 25th independent state of India on 30th May1987. Goa with only two districts " +
                        "South Goa and North Goa, is bordered by Maharashtra in the north, Karnataka in the south " +
                        "and east, and the Arabian Sea on the west. Even though Konkani and Marathi are the main languages, " +
                        "English is also widely spoken by the Goans. Goa is blessed with marvelous beaches and sunshine, " +
                        "splendid churches, and peaceful, warm and friendly people. Best time to visit Goa is November to March.\n";

                break;
            case "Gujraat" :
                log("state : Gujraat");


                name = "Gujarat";
                noOfDist= "33";
                capitl = "Gandhinagar";
                area = "196,024";
                desc = "Gujarat, one of the most industrialized states in India is situated on the west coast of " +
                        "India between 20o-6' N to 24o-42' N north latitude and 68o-10'E to 74o" +
                        "-28'E east longitude. It came into existence as a separate State on 1st May 1960. " +
                        "Gujarat is bounded by the Arabian Sea in the West, by the States of Rajasthan in " +
                        "the North and Northeast, by Madhya Pradesh in the East and by Maharashtra in the " +
                        "South and South East. The State has an international border and has a common " +
                        "frontier with the Pakistan at the northwestern fringe. Ganghinagar, located near Ahmedabad is its capital. " +
                        "At present, Gujarat comprises of 25 districts. The official and primary language spoken is Gujarati.";

                break;
            case "Hariyana" :
                log("state : Hariyana");

                name = "Haryana";
                noOfDist= "22";
                area = "44,212";
                capitl = "Chandigarh";
                desc = "Haryana was carved out of the Indian state of Punjab on 1st November 1966. The state has " +
                        "Uttar Pradesh on its eastern border, Punjab on its western border, Himachal Pradesh and " +
                        "Shivalik Hills on its northern border and Delhi, Rajasthan and Aravali Hills on its southern" +
                        " border. Haryana has a network of tourist complexes, named after birds. These have been set " +
                        "up along the national / state highways and at districts, towns and at places around Delhi. " +
                        "Some of the tourist complexes in Haryana are Badhkal Lake, Dabchik, Jungle Babbler, Karna " +
                        "Lake, Kala teetar, Surajkund and Yadvindra Gardens at Pinjore.";

                break;
            case "Himachal_Pradesh" :
                log("state : Himachal_Pradesh");

                name = "Himachal pradesh";
                capitl = "Shimla";
                area = "55,673";
                noOfDist= "12";
                desc = "Renowned as Deva Bhumi (the land of gods), Himachal Pradesh is a beautiful hill state situated " +
                        "in Northern India. Nestled in Western Himalyas with an area of 21,629 Sq M, the state is " +
                        "landlocked by Jammu and Kashmir on north, Punjab on west and south-west, Haryana and Uttar " +
                        "Pradesh on south, Uttarakhand on south-east and by Tibet, China on the east. Beautiful " +
                        "landscapes having fresh water lakes, gushing rivers, snow capped mountains, flowers and " +
                        "fruits laden trees, glaring and colorful diversity of culture, arts, living style of people " +
                        "etc make Himachal Pradesh, a tourist's paradise. The state is dominated by three main mountain " +
                        "ranges namely the Dhauladhar Range, Pir Pinjal Range and the Great Himalayan Range. Himachal " +
                        "Pradesh was accredited as a Union Territory in 1950 and after the state of Himachal pradesh " +
                        "act in 1971, it was emerged as the 18th state of India.";



                break;
            case "Jammu_and_Kashmir" :
                log("state : Jammu_and_Kashmir");

                name = "Jammu and Kashmir";
                noOfDist= "22";
                area = "222,236";
                capitl = "Shrinagar/ Jammu";
                desc = "Jammu and Kashmir is the sixth largest state in India including the area occupied by Pakistan " +
                        "and China. Jammu and Kashmir, the northernmost state of the Indian union consists of" +
                        " three divisions -Jammu, Kashmir Valley and Ladakh. It has two capitals- Jammu, the" +
                        " winter capital and Srinagar, the summer capital. The state is almost mountainous with " +
                        "stretches of valleys and some mountain lakes. Jammu and Kashmir shares a " +
                        "border with the states of  Himachal Pradesh and Punjab to the south and internationally with the People's" +
                        " Republic of China to the north and east and the Pakistan-administered territories of Azad Kashmir and Gilgit - " +
                        "Baltistan, to the west and northwest respectively.";


                break;
            case "Jharkhand" :
                log("state : Jharkhand");

                name = "Jharkhand";
                noOfDist= "24";
                area = "79,714";
                capitl = "Ranchi";
                desc = "The state of Jharkhand formerly a part of Bihar state, was formed on November 15th, 2000. Jharkhand is the 28th state of the Indian Union. It is bounded by West Bengal in the east, Uttar Pradesh and Chhattisgarh in the west, Bihar In the north and Orissa in the south. The districts are Garwa, Palamu, Chatra, Koderma, Hazaribagh, Giridih, Deoghar, Dumka, Godda, Pakur, Sahibganj, Dhanbad, Bokaro, Ranchi, Lohardagga, Gumla, West Singhbhum and East Singhbhum. Ranchi is the capital.";


                break;
            case "Karnataka" :
                log("state : Karnataka");

                name = "Karnataka";
                noOfDist= "30";
                area = "191,791";
                capitl = "Bangaluru";
                desc = "Karnataka is the eighth largest state in India by area and the ninth largest by population. It was formerly  known as Mysore. On November 1,1973, the name Mysore was changed to Karnataka. Karnataka lies between 74o and 78o East longitudes and 11o and 18o North latitudes. It is situated on the western edge of the Deccan plateau and is surrounded by Maharashtra and Goa in the north, Andhra Pradesh in the east, and Tamil Nadu and Kerala in the south. On the west, it opens out on the Arabian Sea.The state has an equable climate particularly in those areas which are hilly or a high plateau. Climate is the chief attraction of the capital city, Bangalore.";


                break;
            case "Kerala" :
                log("state : Kerala");

                name = "Kerala";
                capitl = "Thiruvanathapuram";
                area = "38,863";
                desc = "Legends speak of Kerala as Parasuramakshetram, 'the land of Parasurama'. The land of Kerala is believed to be a gift of the Arabian Sea. Owing to its favourable location this land fostered trade and established contacts with Egypt, Assyria, Greeks, Romans and the Chinese. The Malayalam era 'Kollavarsha' is believed to have started in the 9th century A.D. During this period of internal strife in Kerala, Cheraman Perumal founded the Chera dynasty (9th century AD). In about 1498 the Portuguese came to Calicut and in 1502 to Kochi.";
                noOfDist= "14";



                break;
            case "Madhya_Pradesh" :
                log("state : Madhya_Pradesh");

                name = "Madhya Pradesh";
                capitl = "Bhopal";
                area = "308,350";
                desc = "A part of Madhya Pradesh has been separated and formed into a new state Chattisgarh from November 1, 2000. The details given here are before the separation. Click on Chattisgarh for more information. Madhya Pradesh situated in the centre of India, is surrounded by Maharashtra and Andhra Pradesh in the south, Uttar Pradesh and Rajasthan in the north, Bihar and Orissa in the east and Gujarat in the west. The state of Madhya Pradesh came into existence on November 1, 1956.";
                noOfDist= "51";



                break;
            case "Maharashtra" :
                log("state : Maharashtra");

                name = "Maharashtra";
                capitl = "Mumbai";
                area = "307,713";
                desc = "Maharashtra is the third largest state in India both in area and population. The state is bounded by the Arabian Sea in the west, Gujarat in the north west, Madhya Pradesh in the north and the east, Andhra Pradesh in the south east and Karnataka and Goa in the south. Maharashtra consists of two major relief divisions. The plateau which is a part of the Deccan tableland and the Konkan coastal strip abutting on the Arabian Sea. The state of Maharashtra forms a huge irregular triangle with its base on the west coast of India, overlooking the Arabian Sea. The coastal strip, about 720 km, long and not more than 80 km wide, is the Konkan dotted with paddy fields and coconut gardens . ";
                noOfDist= "36";



                break;
            case "Manipur" :
                log("state : Manipur");

                name = "Manipur";
                capitl = "Imphal";
                area = "22,327";
                desc = "Known as the 'Jewel of India', as it lies against deep within a lush green corner of North East India, Manipur is a shining pearl in the Himalayan system. Surrounded by blue hills with an oval shaped valley at the centre, Manipur is bounded by Nagaland in the north, Mizoram in the south, upper Myanmar in the east and Cachar district of Assam in the west. The valley portion of the state is surrounded by hill ranges from all sides. Manipur had been a Union Territory from 1956 and became a full-fledged state from 1972. Main Tourist places include War Cemetery, Saheed Minar, Manipur Zoological Garden, Shri Shri Govindajee Temple etc.";
                noOfDist= "16";



                break;
            case "Meghalaya" :
                log("state : Meghalaya");

                name = "Meghalaya";
                capitl = "Shillong";
                area = "22,429";
                desc = "Meghalaya was inaugurated as an autonomous state on April 2,1970. It was declared as a state of the Indian Union on January 21, 1972. Meghalaya is situated in the north-eastern region of India, between the Brahmaputra valley in the north and the Bangladesh in the south. The state of Meghalaya (the abode of clouds) is geographically known as the \"Meghalaya Plateau\" or the \"Shillong Plateau\". The area is made of the oldest rock-formations. Meghalaya consists of the Garo, Khasi and Jaintia hills along with their outliers formed by the Assam ranges";
                noOfDist= "11";



                break;
            case "Mizoram" :
                log("state : Mizoram");

                name = "Mizoram";
                capitl = "Aizawl";
                area = "21,081";
                desc = "Mizoram, in the local language, means the land of Mizos. Mizo itself means highlander. Under the British administration, Mizoram was known as Lushai Hills district. In 1954 by an Act of Parliament, the name was changed to Mizo Hills district. In 1972, when it was made into a union territory, it was named Mizoram. Mizoram became the 23rd state of the Indian union on February 20,1987. ";
                noOfDist= "8";



                break;
            case "Nagaland" :
                log("state : Nagaland");

                name = "Nagaland";
                capitl = "Kohima";
                area = "16,579";
                desc = "Nagaland, the16th state of the Indian Union was born on 1st Dec1963. It is bounded by Assam in the west and north Tirap district of Arunachal Pradesh in the north east, and Manipur in the south. On the east  it shares India's international boundary with Myanmar, Burma. The state is divided into Eight districts : Kohima, Phek, Mokokchung, Wokha, Zunheloto, Twensang, Dimpur and Mon. The terrain ishilly, rugged and mountainous. The highest peak is Saramati in the Twensang district which is 3840 metres above sea-level. The average height of the peaks is between 900 and 1200 metres.";
                noOfDist= "11";



                break;
            case "Odisha" :
                log("state : Odisha");

                name = "Odisha";
                capitl = "Bhubaneswar";
                area = "155,707";
                desc = "Odisha (Orissa) extends from 17o 49'N to 22o 34'N latitude and from 81o 29'E to 87o 29'E longitude on the eastern coast of India. It has an area about 155,707 Sq Km. according to the Census of India 1991. It is bounded by West Bengal in north-east, Bihar in the north, Madhya Pradesh in the west, Andhra Pradesh in the south and the Bay of Bengal in the east. Odisha (Orissa) was separated from Bihar and came into existence on 1 April 1936. The capital was established at the historic city of Cuttack, located at the apex of the Mahanadi delta. In 1956, it shifted to Bhubaneswar, a planned modern town of the post-independence period.";
                noOfDist= "30";



                break;
            case "Punjab" :
                log("state : Punjab");

                name = "Punjab";
                capitl = "Chandigarh";
                desc = "The word \"Punjab\" is made up of two Persian words 'Panj' and 'Aab'. Panj means five and Aab means water. This name was probably  given to this land possibly in an era when this region came into close contact with Persia. The Punjab was known as land of five rivers because of the five rivers that ran through it. They are Indus, Ravi, Beas, Sutlaj and Ghaggar. Prior to Persian period this region was known by different names at different times. Probably, at the height of its glory it was known as Sapta Sindhu, land of the seven rivers, namely Sindhu (Indus), Vitasta (Jehlum), Asuhi (chenab), Purshin (Ravi), Vipasa (Beas), Satadru (Sutleg) and Saruri (Saraswati). The last one is a dried up stream now and its traces are found in the present seasonal streams that flow near Pehowa in Haryana. During Greek occupation, the territory had shrunk into the area covering the five rivers.";
                area = "50,362";
                noOfDist= "22";



                break;
            case "Rajasthan" :
                log("state : Rajasthan");

                name = "Rajasthan";
                capitl = "Jaipur";
                area = "342,239";
                desc = "Rajasthan, the largest state of India was formed on 30 March 1949 with Jaipur as the state capital. Once known as the 'Land of the Kings', the state still retains the glory and richness of those times with its marvelous monuments, colourful traditions and customs. It covers most of the area of the Great Indian desert (Thar Desert) with one edge paralleling the Sutlej - Indus river valley along with its border with Pakistan. It borders Pakistan to the west, the Indian state of Gujarat to the southwest, Madhya Pradesh to the southeast, Uttar Pradesh and Haryana to the northeast and Punjab to the north.Rajasthani and Hindi are the widely used languages in the state. ";
                noOfDist= "33";


                break;
            case "Sikkim" :
                log("state : Sikkim");

                name = "Sikkim";
                capitl = "Gangtok";
                area = "7,096";
                desc = "Sikkim, the 22nd state of the Indian union, is a small mountain state in eastern Himalayas. It is a land of rich and varied scenic beauty, magnificent mountains, eternal snows, dark forests, green fertile valleys, raging torrents and calm, placid lakes. Her magnificent variety of flora and fauna are the naturalist's dream; the steep variations in elevation and rainfall give rise to a glorious multitude of species within a comparatively limited area.";
                noOfDist= "4";



                break;
            case "Tamil_Nadu" :
                log("state : Tamil_Nadu");

                name = "Tamilnadu";
                capitl = "Chennai";
                area = "130,058";
                desc = "Tamilnadu is the eighth largest state in India by area and the ninth largest by population. It was formerly  known as Mysore. On November 1,1973, the name Mysore was changed to Tamilnadu. Tamilnadu lies between 74o and 78o East longitudes and 11o and 18o North latitudes. It is situated on the western edge of the Deccan plateau and is surrounded by Maharashtra and Goa in the north, Andhra Pradesh in the east, and Tamil Nadu and Kerala in the south. On the west, it opens out on the Arabian Sea.The state has an equable climate particularly in those areas which are hilly or a high plateau. Climate is the chief attraction of the capital city, Bangalore.";
                noOfDist= "32";



                break;
            case "Telangana" :
                log("state : Telangana");

                name = "Telangana";
                capitl = "Hyderabad";
                area = "112,077";
                desc = "Telangana, one of the main regions of Andhra Pradesh, formed the 29th state of India on June 2nd 2014 with 10 districts- Khammam, Nalgonda, Warangal, Karimnagar, Medak, Nizamabad, Aadilabad, Mahbubnagar and Hyderabad districts. The existing Andhra Pradesh state is left with 13 districts - nine districts of coastal Andhra, and four districts of the Rayalaseema region. Hyderabad, one of the 10 districts of Telangana, will be the common capital of the two states for 10 years.";
                noOfDist= "31";



                break;
            case "Tripura" :
                log("state : Tripura");

                name = "Tripura";
                area = "10,486";
                capitl = "Agartala";
                desc = "Tripura is the second smallest state in India. It was formally declared as Union Territory on November1st, 1957 and was elevated to the status of a full-fledged state on January 21,1972. The state lies approximately between latitude 22o56' and 24o32' north and longitude 91o10' and 92 21' east. It is bordered by Bangladesh on the west, south and north, by Assam on the north-east and by Mizoram on the east.";
                noOfDist= "8";



                break;
            case "Uttar_Pradesh" :
                log("state : Uttar_Pradesh");

                name = "Uttar Pradesh";
                capitl = "Lucknow";
                area = "243,290";
                desc = "Renowned as the land of Ganges and Yamuna, Uttar Pradesh is considered to be the birth place of Hindusim. The state capital is Lucknow. UP is one the top tourst destinations in India, and it attracts a large number of visitors, both national and international.The fifth largest states in India and most populous state, Uttar Pradesh has the wealth of its monuments, mystical call of its mountains and lakes, and unique religious fervour. One of the seven wonders of world and the symbol of Love, Taj Mahal is situated here. The state has a strategic importance for Indian Defense as it touches Tibet and Nepal on the Northern Border of the country.";
                noOfDist= "75";



                break;
            case "Uttarakhand" :
                log("state : Uttarakhand");

                name = "Uttarakhand";
                capitl = "Dehradun";
                area = "53,483";
                desc = "Uttarakhand (Uttaranchal), formerly a part of Uttar Pradesh was formed on November 9th, 2000 as the 27th state of the Indian Union. The state with Dehradun as the capital has 13 districts including Dehradun, Uttarkashi, Tehri Garhwal, Rudraprayag, Chamoli, Hardwar, Pauri Garhwal, Bageswar, Pithoragarh, Almora, Nainital, Champawat and Udham Singh Nagar. A hill state at the foot of the Himalayas, Uttarakhand is bounded by China in the north & Nepal in the east, Himachal in the north west and Uttar Pradesh in the south.";
                noOfDist= "13";



                break;
            case "West_Bengal" :
                log("state : West_Bengal");

                name = "West Bengal";
                capitl = "Kolkata";
                area = "88,752";
                desc = "1947 as the result of partition of the undivided British Indian province of Bengal into West Bengal. West Bengal covers the bottle neck of India in the east, stretching from Himalayas in the north to the Bay of Bengal in the south. It is bounded on the north by Sikkim and Bhutan, on the east by Assam and Bangladesh. On the south by the Bay of Bengal and on the west by Orissa, Bihar and Nepal. It has therefore, three international frontiers-to the north, east and west. The state lies between 27o13'15\" and 21o25'24\" north latitudes and 85o48'20\" and 89o53'04\" east longitudes.";
                noOfDist= "21";

                break;
        }

        Intent i = new Intent(State.this, State.class);
        i.putExtra("name", name);
        i.putExtra("capital",capitl );
        i.putExtra("area",area  );
        i.putExtra("desc", desc);
        i.putExtra("dists", noOfDist);

        startActivity(i);

    }

}
