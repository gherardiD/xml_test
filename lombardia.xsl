<xsl:stylesheet version="1.0"
      xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
  <xsl:output method="html" indent="yes" encoding="UTF-8" />

  <xsl:template match="/">
    <html>
      <body bgcolor="d4d4b5">
        <h1 align="center">STRUTTURE RICETTIVE IN LOMBARDIA</h1>    
        <xsl:for-each select="strutture/struttura">

          <p>
            ID: 
            <xsl:value-of select="@id"/>
          </p>
          <p>
            COMUNE: 
            <xsl:value-of select="comune"/>
          </p>
          <p>
            PROVINCIA: 
            <xsl:value-of select="provincia"/>
          </p>
          <p>
            DENOMINAZIONE STRUTTURA:
            <xsl:value-of select="denominazione_struttura"/>
          </p>
          <p>
            CATEGORIA:
            <xsl:value-of select="categoria"/>
          </p>
          <hr/>
          <br/>	

        </xsl:for-each>    
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>