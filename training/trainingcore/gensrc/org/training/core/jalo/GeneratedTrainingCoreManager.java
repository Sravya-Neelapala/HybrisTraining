/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2024, 10:14:55 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.ApparelProduct;
import org.training.core.jalo.ApparelSizeVariantProduct;
import org.training.core.jalo.ApparelStyleVariantProduct;
import org.training.core.jalo.CustomCronJob;
import org.training.core.jalo.CustomWcmsComponent;
import org.training.core.jalo.Ebook;
import org.training.core.jalo.ElectronicsColorVariantProduct;
import org.training.core.jalo.Skill;
import org.training.core.jalo.Trainee;
import org.training.core.jalo.Training;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("language", AttributeMode.INITIAL);
		tmp.put("manufacturing", AttributeMode.INITIAL);
		tmp.put("productinfo", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("PAN", AttributeMode.INITIAL);
		tmp.put("LoyaltyCard", AttributeMode.INITIAL);
		tmp.put("SecondaryEmail", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomCronJob createCustomCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.CUSTOMCRONJOB );
			return (CustomCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CustomCronJob createCustomCronJob(final Map attributeValues)
	{
		return createCustomCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomWcmsComponent createCustomWcmsComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.CUSTOMWCMSCOMPONENT );
			return (CustomWcmsComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomWcmsComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomWcmsComponent createCustomWcmsComponent(final Map attributeValues)
	{
		return createCustomWcmsComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public Ebook createEbook(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.EBOOK );
			return (Ebook)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ebook : "+e.getMessage(), 0 );
		}
	}
	
	public Ebook createEbook(final Map attributeValues)
	{
		return createEbook( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Skill createSkill(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.SKILL );
			return (Skill)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Skill : "+e.getMessage(), 0 );
		}
	}
	
	public Skill createSkill(final Map attributeValues)
	{
		return createSkill( getSession().getSessionContext(), attributeValues );
	}
	
	public Trainee createTrainee(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.TRAINEE );
			return (Trainee)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Trainee : "+e.getMessage(), 0 );
		}
	}
	
	public Trainee createTrainee(final Map attributeValues)
	{
		return createTrainee( getSession().getSessionContext(), attributeValues );
	}
	
	public Training createTraining(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.TRAINING );
			return (Training)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Training : "+e.getMessage(), 0 );
		}
	}
	
	public Training createTraining(final Map attributeValues)
	{
		return createTraining( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.language</code> attribute.
	 * @return the language
	 */
	public String getLanguage(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.language</code> attribute.
	 * @return the language
	 */
	public String getLanguage(final Product item)
	{
		return getLanguage( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Product item, final String value)
	{
		setLanguage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyCard</code> attribute.
	 * @return the LoyaltyCard
	 */
	public String getLoyaltyCard(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.LOYALTYCARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyCard</code> attribute.
	 * @return the LoyaltyCard
	 */
	public String getLoyaltyCard(final Customer item)
	{
		return getLoyaltyCard( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyCard</code> attribute. 
	 * @param value the LoyaltyCard
	 */
	public void setLoyaltyCard(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.LOYALTYCARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyCard</code> attribute. 
	 * @param value the LoyaltyCard
	 */
	public void setLoyaltyCard(final Customer item, final String value)
	{
		setLoyaltyCard( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturing</code> attribute.
	 * @return the manufacturing
	 */
	public Date getManufacturing(final SessionContext ctx, final Product item)
	{
		return (Date)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.MANUFACTURING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturing</code> attribute.
	 * @return the manufacturing
	 */
	public Date getManufacturing(final Product item)
	{
		return getManufacturing( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturing</code> attribute. 
	 * @param value the manufacturing
	 */
	public void setManufacturing(final SessionContext ctx, final Product item, final Date value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.MANUFACTURING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturing</code> attribute. 
	 * @param value the manufacturing
	 */
	public void setManufacturing(final Product item, final Date value)
	{
		setManufacturing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.PAN</code> attribute.
	 * @return the PAN
	 */
	public String getPAN(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.PAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.PAN</code> attribute.
	 * @return the PAN
	 */
	public String getPAN(final Customer item)
	{
		return getPAN( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.PAN</code> attribute. 
	 * @param value the PAN
	 */
	public void setPAN(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.PAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.PAN</code> attribute. 
	 * @param value the PAN
	 */
	public void setPAN(final Customer item, final String value)
	{
		setPAN( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productinfo</code> attribute.
	 * @return the productinfo
	 */
	public String getProductinfo(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.PRODUCTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productinfo</code> attribute.
	 * @return the productinfo
	 */
	public String getProductinfo(final Product item)
	{
		return getProductinfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productinfo</code> attribute. 
	 * @param value the productinfo
	 */
	public void setProductinfo(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.PRODUCTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productinfo</code> attribute. 
	 * @param value the productinfo
	 */
	public void setProductinfo(final Product item, final String value)
	{
		setProductinfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.SecondaryEmail</code> attribute.
	 * @return the SecondaryEmail
	 */
	public String getSecondaryEmail(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.SECONDARYEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.SecondaryEmail</code> attribute.
	 * @return the SecondaryEmail
	 */
	public String getSecondaryEmail(final Customer item)
	{
		return getSecondaryEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.SecondaryEmail</code> attribute. 
	 * @param value the SecondaryEmail
	 */
	public void setSecondaryEmail(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.SECONDARYEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.SecondaryEmail</code> attribute. 
	 * @param value the SecondaryEmail
	 */
	public void setSecondaryEmail(final Customer item, final String value)
	{
		setSecondaryEmail( getSession().getSessionContext(), item, value );
	}
	
}
