package com.geeksdev.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader
{
	public static void main(String[] args)
	{
		String csvFile = "C:\\Users\\Admin\\Desktop\\dsconfiguration.csv";
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
		{

			while ((line = br.readLine()) != null)
			{
				String[] str = line.split(cvsSplitBy);

				System.out.println("<file>${project.build.outputDirectory}/../ds-casebuilder-web/WEB-INF/lib/"+str[0]+"</file>");

			}

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}