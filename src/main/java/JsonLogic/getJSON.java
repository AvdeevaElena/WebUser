package JsonLogic;

import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

/*Класс для оргнизиции получения JSON из удаленного сервера*/

public class getJSON {              
                          /*вспомогательный статический метод символьного потока чтения и конвертации данных в строку*/   
						  
        private static String readAll(Reader rd) throws IOException {  // метод, возвращает строку, в качестве аргумента принимает символьный поток, в случае некорректного 


                                                                       // чтения, не выполняется или интерпретации выбрасывается исключение типа  IOException
            StringBuilder sb = new StringBuilder();                      //  не синхронизированный класс для работы с символами и  строками
            int cp;                                         //  размер буфера чтения
            while ((cp = rd.read()) != -1) {                //  цикл, позволяющий перебирать все элементы(символы) передаваемые для чтения. 
			                                                //  int read() - возвращает целочисленное представление следующего доступного символа вызывающего входного потока. При достижении конца файла возвращает значение -1. 
                sb.append((char) cp);                       //  каждый последующий символ добавляет и обновляет значение объекта, который вызвал метод append, с предварительной конвертиртацией байта в символ
            }
            return sb.toString();                           //  генерация массива символов в строку и возвращение ее в качестве результата работы метода 
 			}

			/*статический метод получение данных передаваемых по ссылке и их конвертация в формат  JSON объекта*/   
			
        public static JSONObject readJsonFromUrl(String url) throws IOException {   // метод, возвращает JSON объект, в качестве аргумента принимает ссылку с адресом в интернете
            InputStream is = new URL(url).openStream();                            //  открывает соединение с URL ссылкой и возвращает InputStream для чтения из этого соединения
            try {                                           // в секции try попытка организовать чтение и запись данных
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8"))); // ведет посимвольную запись данных (byte [])приходящих с потока с предврительных их конвертацией в кодировку "UTF-8" 
                String jsonText = readAll(rd); 		// вызов метода символьного потока чтения и конвертации данных в строку 
                JSONObject json;              		// создание объекта типа  JSON
                json = new JSONObject(jsonText);    // в качестве содержания выше созданный JSONObject принимает считанные данные по ссылке
                return json;                        // возвращает созданный JSON объект
            } finally {                             // секция finally выполнится при любых условиях 
                is.close();                         // закрытие соединения 
            }
        }

}

