/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2024, 10:14:55 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Training;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Ebook}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedEbook extends Product
{
	/** Qualifier of the <code>Ebook.publisher</code> attribute **/
	public static final String PUBLISHER = "publisher";
	/** Qualifier of the <code>Ebook.edition</code> attribute **/
	public static final String EDITION = "edition";
	/** Qualifier of the <code>Ebook.trainings</code> attribute **/
	public static final String TRAININGS = "trainings";
	/** Relation ordering override parameter constants for Ebook2TrainingRelation from ((trainingcore))*/
	protected static String EBOOK2TRAININGRELATION_SRC_ORDERED = "relation.Ebook2TrainingRelation.source.ordered";
	protected static String EBOOK2TRAININGRELATION_TGT_ORDERED = "relation.Ebook2TrainingRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Ebook2TrainingRelation from ((trainingcore))*/
	protected static String EBOOK2TRAININGRELATION_MARKMODIFIED = "relation.Ebook2TrainingRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PUBLISHER, AttributeMode.INITIAL);
		tmp.put(EDITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.edition</code> attribute.
	 * @return the edition
	 */
	public Integer getEdition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.edition</code> attribute.
	 * @return the edition
	 */
	public Integer getEdition()
	{
		return getEdition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.edition</code> attribute. 
	 * @return the edition
	 */
	public int getEditionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEdition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.edition</code> attribute. 
	 * @return the edition
	 */
	public int getEditionAsPrimitive()
	{
		return getEditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.edition</code> attribute. 
	 * @param value the edition
	 */
	public void setEdition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.edition</code> attribute. 
	 * @param value the edition
	 */
	public void setEdition(final Integer value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.edition</code> attribute. 
	 * @param value the edition
	 */
	public void setEdition(final SessionContext ctx, final int value)
	{
		setEdition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.edition</code> attribute. 
	 * @param value the edition
	 */
	public void setEdition(final int value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Training");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.publisher</code> attribute.
	 * @return the publisher
	 */
	public String getPublisher(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PUBLISHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.publisher</code> attribute.
	 * @return the publisher
	 */
	public String getPublisher()
	{
		return getPublisher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PUBLISHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final String value)
	{
		setPublisher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.trainings</code> attribute.
	 * @return the trainings
	 */
	public Collection<Training> getTrainings(final SessionContext ctx)
	{
		final List<Training> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			"Training",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ebook.trainings</code> attribute.
	 * @return the trainings
	 */
	public Collection<Training> getTrainings()
	{
		return getTrainings( getSession().getSessionContext() );
	}
	
	public long getTrainingsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			"Training",
			null
		);
	}
	
	public long getTrainingsCount()
	{
		return getTrainingsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.trainings</code> attribute. 
	 * @param value the trainings
	 */
	public void setTrainings(final SessionContext ctx, final Collection<Training> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ebook.trainings</code> attribute. 
	 * @param value the trainings
	 */
	public void setTrainings(final Collection<Training> value)
	{
		setTrainings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainings. 
	 * @param value the item to add to trainings
	 */
	public void addToTrainings(final SessionContext ctx, final Training value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainings. 
	 * @param value the item to add to trainings
	 */
	public void addToTrainings(final Training value)
	{
		addToTrainings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainings. 
	 * @param value the item to remove from trainings
	 */
	public void removeFromTrainings(final SessionContext ctx, final Training value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainings. 
	 * @param value the item to remove from trainings
	 */
	public void removeFromTrainings(final Training value)
	{
		removeFromTrainings( getSession().getSessionContext(), value );
	}
	
}
