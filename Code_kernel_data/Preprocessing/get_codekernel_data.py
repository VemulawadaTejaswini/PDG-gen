import os
import sys
import tqdm
import requests
from bs4 import BeautifulSoup

APIs_LIST = ["BufferedReader.readLine", 'Calendar.getTime', 'Socket.connect', 'URL.openConnection', 
             'DriverManager.getConnection', 'Graphics2D.fill', 'DateFormat.format', 'Thread.start', 
             'BufferedReader.read', 'JPanel.add', 'ExecutorService.submit', 'ClassLoader.getResource', 
             'ClassLoader.loadClass', 'URL.openConnection', 'DataInputStream.readLine', 'URI.getFragment', 
             'File.toURI', 'Lock.lock', 'Runtime.freeMemory', 'ServerSocket.bind', 'Timestamp.compareTo', 
             'PreparedStatement.executeQuery', 'Statement.execute', 'FileChannel.read', 'Runtime.maxMemory']
CLUSTER_COUNTS = [8, 13, 10, 17, 20, 12, 13, 8, 6, 12, 2, 4, 6, 17, 4, 6, 11, 1, 5, 5, 2, 12, 11, 10, 4]
CODE_KERNEL_WEBSITE = "https://guxd.github.io/codekernel/samples/$1/cluster$2.html"
OUTPUT_FOLDER = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Code_kernel_data/Rawdata"

for api_no, api_name in tqdm.tqdm(enumerate(APIs_LIST)):
    api_output_folder = OUTPUT_FOLDER + "/" + api_name
    if not os.path.exists(api_output_folder):
        os.makedirs(api_output_folder)
    for sample_no in range(CLUSTER_COUNTS[api_no]):
        api_sample_page = CODE_KERNEL_WEBSITE.replace("$1", api_name).replace("$2", str(sample_no))
        api_sample_file = open(api_output_folder + "/" + "sample-{}".format(sample_no) + ".txt", "w+")
        r = requests.get(api_sample_page)
        soup = BeautifulSoup(r.content, 'html5lib')
        api_sample_file.write(soup.get_text())
        api_sample_file.close()
        
