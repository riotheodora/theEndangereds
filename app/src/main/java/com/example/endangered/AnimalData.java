package com.example.endangered;

import java.util.ArrayList;

public class AnimalData {
    public static String[][] data = new String[][]{
            {"Amur Leopard", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/878/images/hero_small/amur-leopard_99144569.jpg?1345532564","More than 84 individuals", "Panthera pardus orientalis", "70 -105 pounds", "Temperate, Broadleaf, and Mixed Forests", "People usually think of leopards in the savannas of Africa but in the Russian Far East, a rare subspecies has adapted to life in the temperate forests that make up the northern-most part of the species’ range. Similar to other leopards, the Amur leopard can run at speeds of up to 37 miles per hour. This incredible animal has been reported to leap more than 19 feet horizontally and up to 10 feet vertically.\n" +
                    "\n" +
                    "The Amur leopard is solitary. Nimble-footed and strong, it carries and hides unfinished kills so that they are not taken by other predators. It has been reported that some males stay with females after mating, and may even help with rearing the young. Several males sometimes follow and fight over a female. They live for 10-15 years, and in captivity up to 20 years. The Amur leopard is also known as the Far East leopard, the Manchurian leopard or the Korean leopard.\n" +
                    "\n"},
            {"Bornean Orangutan", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/1145/images/hero_small/Bornean_Orangutan_8.1.2012_hero_and_circle_XL_279107.jpg?1345587030", "About 104,700", "Pongo pygmaeus", "66–220 pounds", "Lowland rainforests and tropical, swamp and mountain forests", "Bornean orangutan populations have declined by more than 50% over the past 60 years, and the species' habitat has been reduced by at least 55% over the past 20 years.\n" +
                    "\n" +
                    "The Bornean orangutan differs in appearance from the Sumatran orangutan, with a broader face and shorter beard and also slightly darker in color. Three subspecies are recognized, each localized to different parts of the island: Northwest, Northeast and Central"},
            {"Chimpanzee", "Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/1255/images/hero_small/Chimpanzee-1600x600px.jpg?1345590038", "172,700 to 299,700", "Pan troglodytes", "Male Adult: 40 - 70 Kg, Female Adult: 32 - 47 Kg", "Forests (moist and dry forests)", "Like us, chimps are highly social animals, care for their offspring for years and can live to be over 50. In fact, chimpanzees are our closest cousins; we share about 98 percent of our genes.\n" +
                    "\n" +
                    "In their habitat in the forests of central Africa, chimpanzees spend most of their days in the tree tops. When they do come down to earth, chimps usually travel on all fours, though they can walk on their legs like humans for as far as a mile. They use sticks to fish termites out of mounds and bunches of leaves to sop up drinking water."},
            {"Giant Panda", "Vulnerable", "https://c402277.ssl.cf1.rackcdn.com/photos/11551/images/hero_small/Bernard_de_wetter_wwf_canon_113974.jpg?1462218465", "1,864 in the wild", "Ailuropoda melanoleuca", "220–330 pounds", "Temperate broadleaf and mixed forests of southwest China", "This peaceful creature with a distinctive black and white coat is adored by the world and considered a national treasure in China. The panda also has a special significance for WWF because it has been WWF's logo since our founding in 1961.\n" +
                    "\n" +
                    "Pandas live mainly in bamboo forests high in the mountains of western China, where they subsist almost entirely on bamboo. They must eat from 26 to 84 pounds of it every day, a formidable task for which they use their enlarged wrist bones that function as opposable thumbs.\n" +
                    "\n" +
                    "A newborn panda is about the size of a stick of butter—about 1/900th the size of its mother—but can grow to up to 330 pounds as an adult. These bears are excellent tree climbers despite their bulk."},
            {"Irrawaddy Dolphin", "Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/2715/images/hero_small/Mekong_Irrawaddy_Dolphin_breaching_%28c%29_WWF_Greater_Mekong.jpg?1421877230", "92", "Orcaella brevirostris", "198-440 pounds", "Lakes, Rivers, Estuaries, and Coasts", "Irrawaddy dolphins are found in coastal areas in South and Southeast Asia, and in three rivers: the Ayeyarwady (Myanmar), the Mahakam (Indonesian Borneo) and the Mekong. The Mekong River Irrawaddy dolphins inhabit a 118-mile stretch of the river between Cambodia and Lao PDR and are scarce—just 92 individuals are estimated to still exist. These dolphins have a bulging forehead, short beak, and 12-19 teeth on each side of both jaws."},
            {"Javan Rhino", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/9496/images/hero_small/_H9A0249.jpg?1436885827", "58–68", "Rhinoceros sondaicus", "1,984 - 5,071 pounds", "Tropical forests", "Javan rhinos are the most threatened of the five rhino species, with only 58-68 individuals that live only in Ujung Kulon National Park in Java, Indonesia. Javan rhinos once lived throughout northeast India and Southeast Asia. Vietnam’s last Javan rhino was poached in 2010.\n" +
                    "\n" +
                    "This species is a dusky grey color and has a single horn of up to about 10 inches. Its skin has a number of loose folds, giving the appearance of armor plating. The Javan rhino is very similar in appearance to the closely-related greater one-horned rhinoceros, but has a much smaller head and less apparent skin folds."},
            {"Sumatran Elephant", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/1683/images/hero_small/MID_247517.jpg?1345600799", "2,400 – 2,800", "Elephas maximus sumatranus", "approximately 5 tons", "Broadleaf moist tropical forests", "Sumatran elephants feed on a variety of plants and deposit seeds wherever they go, contributing to a healthy forest ecosystem. They also share their lush forest habitat with several other endangered species, such as the Sumatran rhino, tiger, and orangutan, and countless other species that all benefit from an elephant population that thrives in a healthy habitat."},
            {"Sumatran Orangutan", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/1368/images/carousel_small/Sumatran_Orangutan_8.6.2012_Why_They_Matter_XL_257639.jpg?1433174986", "14,613", "Pongo abelii", "66 – 198 pounds", "Tropical and Subtropical Moist Broadleaf Forests", "The Sumatran orangutan is almost exclusively arboreal, living among the trees of tropical rainforests. Females virtually never travel on the ground and adult males do so rarely. Sumatran orangutans are reported to have closer social ties than their Bornean cousins. This has been attributed to mass fruit on fig trees, where groups of Sumatran orangutans can come together to feed. Adult males are typically solitary while females are accompanied by offspring.\n" +
                    "\n" +
                    "Historically, the Sumatran orangutan was distributed over the entire island of Sumatra and further south into Java. The species' range is now restricted to the north of the island with a majority in the provinces of North Sumatra and Aceh. Of the nine existing populations of Sumatran orangutans, only seven have prospects of long-term viability, each with an estimated 250 or more individuals. Only three populations contain more than 1,000 orangutans. Orangutans that were confiscated from the illegal trade or as pets are being reintroduced to Bukit Tigapuluh National Park. They number around 70 and are reproducing."},
            {"Sumatran Rhino", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/1417/images/hero_small/Photo_1_Sumatran_rhino_3_%28c%29_Bill_Konstant_International_Rhino_Foundation.jpg?1345594108", "80", "Dicerorhinus sumatrensis", "1,320-2,090 pounds", "Dense highland and lowland tropical and sub-tropical forests", "Sumatran rhinos are the smallest of the living rhinoceroses and the only Asian rhino with two horns. They are covered with long hair and are more closely related to the extinct woolly rhinos than any of the other rhino species alive today. Calves are born with a dense covering that turns reddish brown in young adults and becomes sparse, bristly and almost black in older animals. Sumatran rhinos compete with the Javan rhino for the unenviable title of most threatened rhino species. While surviving in greater numbers than the Javan rhino, Sumatran rhinos are more threatened by poaching. There is no indication that the population is stable and just two captive females have reproduced in the last 15 years.\n" +
                    "\n" +
                    "The Sumatran rhino once roamed as far away as the foothills of the Eastern Himalayas in Bhutan and eastern India, through Myanmar, Thailand, possibly to Vietnam and China, and south through the Malay Peninsula. Two different subspecies, the western Sumatran and eastern Sumatran, cling for survival on the islands of Sumatra and Borneo. Experts believe the third subspecies is probably extinct."},
            {"Sumatran Tiger", "Critically Endangered", "https://c402277.ssl.cf1.rackcdn.com/photos/2090/images/hero_small/Sumatran-Tiger-Hero.jpg?1345559303","Less than 400", "Panthera tigris sumatrae", "165–308 pounds", "Tropical broadleaf evergreen forests, freshwater swamp forests and peat swamps", "Sumatran tigers are the smallest surviving tiger subspecies and are distinguished by heavy black stripes on their orange coats. The last of Indonesia’s tigers—less than 400 today—are holding on for survival in the remaining patches of forests on the island of Sumatra. Accelerating deforestation and rampant poaching mean this noble creature could end up like its extinct Javan and Balinese relatives.\n" +
                    "\n" +
                    "In Indonesia, anyone caught hunting tigers could face jail time and steep fines. But despite increased efforts in tiger conservation—including strengthening law enforcement and antipoaching capacity—a substantial market remains in Sumatra and the rest of Asia for tiger parts and products. Sumatran tigers are losing their habitat and prey fast, and poaching shows no sign of decline."}
    };

    public static ArrayList<Animal> getListData() {
        ArrayList<Animal> list = new ArrayList<>();

        for (String[] aData : data) {
            Animal animal = new Animal();
            animal.setAnimal_name(aData[0]);
            animal.setStatus(aData[1]);
            animal.setPhoto(aData[2]);
            animal.setPopulation(aData[3]);
            animal.setScientific_name(aData[4]);
            animal.setWeight(aData[5]);
            animal.setHabitat(aData[6]);
            animal.setDetail(aData[7]);

            list.add(animal);
        }
        return list;
    }
}
