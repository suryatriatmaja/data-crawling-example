package com.Crawling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class CrawlingBukalapak {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Create a Logger
		Logger logger = Logger.getLogger(CrawlingBukalapak.class.getName());
		FileHandler fileHandler = new FileHandler("/home/joker/Desktop/databukalapakcrawlLOGGER.log", true); //-> path for save and log engine
		logger.addHandler(fileHandler);

		// get http html
		Document doc = Jsoup.connect(
				"https://www.bukalapak.com/p/handphone/hp-smartphone/2ew5ezo-jual-xiaomi-redmi-note-4x-ram-4gb-rom-64gb?dtm_section=top_promoted&dtm_source=list-product&from=&product_owner=normal_seller")
				.timeout(1000000).get();

		// write file html
		BufferedWriter writer = new BufferedWriter(new FileWriter("/home/joker/Desktop/databukalapakcrawl.html")); //-> path for save and write html
		writer.write(doc.toString());

		// Call info method
		logger.info("Crawling succes");

	}

}
