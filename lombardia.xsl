<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes" encoding="UTF-8" />

  <xsl:template match="/">
    <html>
      <head>
        <style>
          body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 2em, 0;
            padding: 0;
            min-height: 100vh;
          }
          h1 {
            text-align: center;
            color: #333;
          }
          .struttura {
            background-color: #fff;
            border: 2px solid #ccc;
            border-radius: 5px;
            padding: 20px;
            margin: 20px auto;
            max-width: 600px;
            box-shadow: 0px 0px 8px #0000FF;
          }
          .struttura p {
            margin: 0;
          }
          .struttura hr {
            border: none;
            border-top: 1px solid #0000FF;
            margin-top: 10px;
          }
        </style>
      </head>
      <body>
        <h1>STRUTTURE RICETTIVE IN LOMBARDIA</h1>
        <xsl:for-each select="strutture/struttura">
          <div class="struttura">
            <p>ID: <xsl:value-of select="@id"/></p>
            <p>COMUNE: <xsl:value-of select="comune"/></p>
            <p>PROVINCIA: <xsl:value-of select="provincia"/></p>
            <p>DENOMINAZIONE STRUTTURA: <xsl:value-of select="denominazione_struttura"/></p>
            <p>CATEGORIA: <xsl:value-of select="categoria"/></p>
            <hr/>
          </div>
        </xsl:for-each>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>