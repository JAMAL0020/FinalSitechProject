package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getPropertyObject() throws IOException {

        FileInputStream fp = new FileInputStream("src/main/Config.properties");

        //we have to create object of properties file
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }

    public static String getUrl () throws IOException {

        return getPropertyObject().getProperty("url");
    }

    public static String getUsername () throws IOException {

        return getPropertyObject().getProperty("username");
    }

    public static String getPassword () throws IOException {

        return getPropertyObject().getProperty("password");
    }

    public static String getShoppingCartLogoLocator() throws IOException {

        return getPropertyObject().getProperty("shoppingCartLogoLocator");
    }















}
