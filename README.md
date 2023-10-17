## Creating .jks file

To create a .jks file , use that command in certificate file.

```
keytool -importcert -file "certificate.cer" -keystore key.jks -alias "<anything>"  
```
Here, **certificate.cer** is the name of certificate. **key.jks** is the name of .jks file.

To get a certificate, visit https://localhost:9200 in chrome and click **Not Secure** in left top side and 
click **Certificate is not valid**. A pop-up is opened and click **Details** later click **Export** to get certificate of elasticsearch.