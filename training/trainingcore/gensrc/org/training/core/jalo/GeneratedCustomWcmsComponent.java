/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2024, 10:14:55 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link org.training.core.jalo.CustomWcmsComponent CustomWcmsComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomWcmsComponent extends SimpleBannerComponent
{
	/** Qualifier of the <code>CustomWcmsComponent.headrerText</code> attribute **/
	public static final String HEADRERTEXT = "headrerText";
	/** Qualifier of the <code>CustomWcmsComponent.buttonText</code> attribute **/
	public static final String BUTTONTEXT = "buttonText";
	/** Qualifier of the <code>CustomWcmsComponent.offerImage</code> attribute **/
	public static final String OFFERIMAGE = "offerImage";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HEADRERTEXT, AttributeMode.INITIAL);
		tmp.put(BUTTONTEXT, AttributeMode.INITIAL);
		tmp.put(OFFERIMAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.buttonText</code> attribute.
	 * @return the buttonText - BGS Hero banner button text
	 */
	public String getButtonText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.getButtonText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BUTTONTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.buttonText</code> attribute.
	 * @return the buttonText - BGS Hero banner button text
	 */
	public String getButtonText()
	{
		return getButtonText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.buttonText</code> attribute. 
	 * @return the localized buttonText - BGS Hero banner button text
	 */
	public Map<Language,String> getAllButtonText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BUTTONTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.buttonText</code> attribute. 
	 * @return the localized buttonText - BGS Hero banner button text
	 */
	public Map<Language,String> getAllButtonText()
	{
		return getAllButtonText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.buttonText</code> attribute. 
	 * @param value the buttonText - BGS Hero banner button text
	 */
	public void setButtonText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.setButtonText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BUTTONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.buttonText</code> attribute. 
	 * @param value the buttonText - BGS Hero banner button text
	 */
	public void setButtonText(final String value)
	{
		setButtonText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.buttonText</code> attribute. 
	 * @param value the buttonText - BGS Hero banner button text
	 */
	public void setAllButtonText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BUTTONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.buttonText</code> attribute. 
	 * @param value the buttonText - BGS Hero banner button text
	 */
	public void setAllButtonText(final Map<Language,String> value)
	{
		setAllButtonText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headrerText</code> attribute.
	 * @return the headrerText
	 */
	public String getHeadrerText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.getHeadrerText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, HEADRERTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headrerText</code> attribute.
	 * @return the headrerText
	 */
	public String getHeadrerText()
	{
		return getHeadrerText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headrerText</code> attribute. 
	 * @return the localized headrerText
	 */
	public Map<Language,String> getAllHeadrerText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,HEADRERTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.headrerText</code> attribute. 
	 * @return the localized headrerText
	 */
	public Map<Language,String> getAllHeadrerText()
	{
		return getAllHeadrerText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headrerText</code> attribute. 
	 * @param value the headrerText
	 */
	public void setHeadrerText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomWcmsComponent.setHeadrerText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, HEADRERTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headrerText</code> attribute. 
	 * @param value the headrerText
	 */
	public void setHeadrerText(final String value)
	{
		setHeadrerText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headrerText</code> attribute. 
	 * @param value the headrerText
	 */
	public void setAllHeadrerText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,HEADRERTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.headrerText</code> attribute. 
	 * @param value the headrerText
	 */
	public void setAllHeadrerText(final Map<Language,String> value)
	{
		setAllHeadrerText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.offerImage</code> attribute.
	 * @return the offerImage
	 */
	public Media getOfferImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, OFFERIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomWcmsComponent.offerImage</code> attribute.
	 * @return the offerImage
	 */
	public Media getOfferImage()
	{
		return getOfferImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.offerImage</code> attribute. 
	 * @param value the offerImage
	 */
	public void setOfferImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, OFFERIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomWcmsComponent.offerImage</code> attribute. 
	 * @param value the offerImage
	 */
	public void setOfferImage(final Media value)
	{
		setOfferImage( getSession().getSessionContext(), value );
	}
	
}
